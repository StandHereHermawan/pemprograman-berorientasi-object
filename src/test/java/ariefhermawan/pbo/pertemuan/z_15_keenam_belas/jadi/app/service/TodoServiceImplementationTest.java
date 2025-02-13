package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepository;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepositoryImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util.DatabaseConnectionUtil;

import com.zaxxer.hikari.HikariDataSource;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class TodoServiceImplementationTest {
    private HikariDataSource hikariDataSource;
    private TodolistRepository todolistRepository;
    private TodolistService todolistService;

    @BeforeEach
    void setUp() {
        this.hikariDataSource = DatabaseConnectionUtil.getDataSource();
        this.todolistRepository = new TodolistRepositoryImplementation(this.hikariDataSource);
        this.todolistService =
                new TodolistServiceImplementation(
                        this.todolistRepository
                );
    }

    @AfterEach
    void tearDown() {
        this.resetDatabaseState();
    }

    @AfterAll
    static void afterAll() {
        var closeDatabase =
                new TodoServiceImplementationTest();
        closeDatabase.hikariDataSource = DatabaseConnectionUtil.getDataSource();
        closeDatabase.hikariDataSource.close();
    }

    private Todo createOneTodolist(String todo) {
        Todo todolist = new Todo();
        todolist.setTodo(todo);
        return todolist;
    }

    private List<Todo> createAlotOfTodo(String... todos) {
        List<Todo> aLotOfTodo = new ArrayList<>();
        for (int i = 0; i < todos.length; i++) {
            Todo todo = this.createOneTodolist(todos[i]);
            todo.setId(i);
            todo.setTodo(todos[i]);
            aLotOfTodo.add(todo);
        }
        return aLotOfTodo;
    }

    private void resetDatabaseState() {
        try {
            Connection connection = this.hikariDataSource.getConnection();
            PreparedStatement flushDatabase =
                    connection.prepareStatement("DELETE FROM todolists");
            flushDatabase.execute();
            PreparedStatement resetAutoIncrement =
                    connection.prepareStatement("ALTER TABLE todolists AUTO_INCREMENT = 1");
            resetAutoIncrement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void seedTheDatabase() {
        List<Todo> alotOfTodo = createAlotOfTodo("Membuka Facebook",
                "Memberi reaksi pada postingan",
                "Nonton Reels",
                "Membuka Grup Omkegas rimsvek",
                "Membuka Grup GFL Konawe");

        for (Todo todo : alotOfTodo) {
            todolistRepository.insertOneTodolistToRDBMS(todo);
        }
    }

    private void pauseProgramForSomeSeconds(Integer durationOfSeconds) {
        try {
            System.out.println("\t" + "Thread Starts Sleeping");
            Thread.sleep(Duration.ofSeconds(durationOfSeconds));
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testShowTodolist() {
        todolistService.showTodolist();
        pauseProgramForSomeSeconds(2);

        this.seedTheDatabase();
        todolistService.showTodolist();
    }
}