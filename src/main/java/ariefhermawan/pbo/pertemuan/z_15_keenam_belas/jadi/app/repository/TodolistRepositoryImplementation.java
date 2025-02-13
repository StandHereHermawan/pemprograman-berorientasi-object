package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodolistRepositoryImplementation
        extends TodolistRepositoryAbstractClass
        implements TodolistRepository {

    private final DataSource dataSource;

    private List<Todo> todoFromDatabase;

    public TodolistRepositoryImplementation(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Todo> getAllTodolistInDatabaseNotYetDeleted() {
        String sqlCommand = "SELECT id, todo, created_at, updated_at FROM todolists WHERE is_deleted = false";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
                ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            this.todoFromDatabase = new ArrayList<>();

            while (resultSet.next()) {
                Todo todo = new Todo();
                todo.setId(resultSet.getInt("id"));
                todo.setTodo(resultSet.getString("todo"));
                todo.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
                todo.setUpdatedAt(resultSet.getTimestamp("updated_at").toLocalDateTime());

                // Move data from HDD/SDD to volatile storage alias RAM.
                this.todoFromDatabase.add(todo);
            }

            return this.todoFromDatabase;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Todo getOneTodolistDataFromRDBMS(Integer todolistId) {
        String sql = "SELECT id, todo, created_at, updated_at FROM todolists WHERE is_deleted = false AND id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setInt(1, todolistId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                Todo todo = new Todo();
                if (resultSet.next()) {
                    todo.setId(resultSet.getInt("id"));
                    todo.setTodo(resultSet.getString("todo"));
                    todo.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
                    todo.setUpdatedAt(resultSet.getTimestamp("updated_at").toLocalDateTime());
                    return todo;
                } else {
                    return null;
                }
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Todo insertOneTodolistToRDBMS(Todo todo) {
        String sql = "INSERT INTO todolists(todo) VALUES (?)";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, todo.getTodo());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        todo.setId(this.lastIndexValueThatBeenInserted());
        return todo;
    }

    @Override
    public boolean isTodoWithThisIndexExist(Integer todoIndex) {
        String sql = "SELECT id FROM todolists WHERE id = ? AND is_deleted = FALSE";
        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, todoIndex);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public int lastIndexValueThatBeenInserted() {
        String sql = "SELECT LAST_INSERT_ID()";
        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("LAST_INSERT_ID()");
                } else {
                    throw new SQLException("Not yet data been inserted");
                }
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public boolean removeTodolistById(Integer todolistId) {
        if (isTodoWithThisIndexExist(todolistId)) {
            String sql = "UPDATE todolists SET is_deleted = TRUE WHERE id = ? AND is_deleted = FALSE";
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement statement = connection.prepareStatement(sql)
            ) {
                statement.setInt(1, todolistId);
                statement.executeUpdate();
                return true;
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        } else {
            return false;
        }
    }

    @Override
    public Todo removeTodoById(Integer todolistId) {
        Todo todo;
        if (isTodoWithThisIndexExist(todolistId)) {
            todo = this.getOneTodolistDataFromRDBMS(todolistId);
            String sql = "UPDATE todolists SET is_deleted = TRUE WHERE id = ? AND is_deleted = FALSE";
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)
            ) {
                statement.setInt(1, todolistId);
                statement.executeUpdate();
                return todo;
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        } else {
            todo = new Todo();
            todo.setTodo(null);
            return todo;
        }
    }

    @Override
    public boolean updateTodolist(Integer idTodo, Todo todo) {
        if (isTodoWithThisIndexExist(idTodo)) {
            String sql = "UPDATE todolists SET todo = ? WHERE id = ? AND is_deleted = FALSE";
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement statement = connection.prepareStatement(sql)
            ) {
                statement.setString(1, todo.getTodo());
                statement.setInt(2, idTodo);
                statement.executeUpdate();
                return true;
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        } else {
            return false;
        }
    }
}
