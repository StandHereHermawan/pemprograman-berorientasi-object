package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util.DatabaseConnectionUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoRepositoryImplementationTest {
    private HikariDataSource hikariDataSource;
    private TodolistRepositoryAbstractClass todolistRepositoryAbstractClass;

    @BeforeEach
    void setUp() {
        this.hikariDataSource = DatabaseConnectionUtil.getDataSource();
        this.todolistRepositoryAbstractClass = new TodolistRepositoryImplementation(this.hikariDataSource);
    }

    @AfterEach
    void tearDown() {
        this.resetDatabaseState();
    }

    @AfterAll
    static void afterAll() {
        var closeDatabase = new TodoRepositoryImplementationTest();
        closeDatabase.hikariDataSource = DatabaseConnectionUtil.getDataSource();
        closeDatabase.hikariDataSource.close();
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

    private void pauseProgramForSomeSeconds(Integer durationOfSeconds) {
        try {
            System.out.println("\t" + "Thread Starts Sleeping");
            Thread.sleep(Duration.ofSeconds(durationOfSeconds));
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testFunctionToInsertDataToRDBMS() {
        Todo membukaFacebook =
                this.todolistRepositoryAbstractClass.insertOneTodolistToRDBMS(
                        this.createOneTodolist("Membuka Facebook")
                );

        assertNotNull(membukaFacebook);
        assertEquals(membukaFacebook.getTodo(), "Membuka Facebook");
    }

    @Test
    void testFunctionToGetOneTodoDataFromRDBMS() {
        List<Todo> alotOfTodo = this.createAlotOfTodo(
                "Membuka Facebook",
                "Memberi reaksi pada postingan",
                "Nonton Reels",
                "Membuka Grup Omkegas rimsvek",
                "Membuka Grup GFL Konawe"
        );

        while (!alotOfTodo.isEmpty()) {
            this.todolistRepositoryAbstractClass.insertOneTodolistToRDBMS(alotOfTodo.removeFirst());
        }

        Todo oneTodoDataFromRDBMS = this.todolistRepositoryAbstractClass.getOneTodolistDataFromRDBMS(1);
        assertNotNull(oneTodoDataFromRDBMS);
        System.out.println(oneTodoDataFromRDBMS);
    }

    @Test
    void testQueryLastInsertIDAggregateFunction() {
        List<Todo> alotOfTodo = this.createAlotOfTodo(
                "Membuka Facebook",
                "Memberi reaksi pada postingan",
                "Nonton Reels",
                "Membuka Grup Omkegas rimsvek",
                "Membuka Grup GFL Konawe"
        );

        while (!alotOfTodo.isEmpty()) {
            this.todolistRepositoryAbstractClass.insertOneTodolistToRDBMS(alotOfTodo.removeFirst());
        }

        int lastIndexValueThatBeenInserted = this.todolistRepositoryAbstractClass.lastIndexValueThatBeenInserted();
        System.out.println("\t" + "Last index value in database: " + lastIndexValueThatBeenInserted);
    }

    @Test
    void testFunctionSoftDelete() {
        List<Todo> alotOfTodo = this.createAlotOfTodo(
                "Membuka Facebook",
                "Memberi reaksi pada postingan",
                "Nonton Reels",
                "Membuka Grup Omkegas rimsvek",
                "Membuka Grup GFL Konawe"
        );

        while (!alotOfTodo.isEmpty()) {
            this.todolistRepositoryAbstractClass.insertOneTodolistToRDBMS(alotOfTodo.removeFirst());
        }

        int lastIndexValueThatBeenInserted =
                todolistRepositoryAbstractClass.lastIndexValueThatBeenInserted();
        Todo oneTodoDataFromRDBMS =
                todolistRepositoryAbstractClass.getOneTodolistDataFromRDBMS(lastIndexValueThatBeenInserted);

        this.pauseProgramForSomeSeconds(5);
        assertNotNull(oneTodoDataFromRDBMS);
        System.out.println(oneTodoDataFromRDBMS);

        todolistRepositoryAbstractClass.removeTodolistById(lastIndexValueThatBeenInserted);
        oneTodoDataFromRDBMS =
                todolistRepositoryAbstractClass.getOneTodolistDataFromRDBMS(lastIndexValueThatBeenInserted);

        assertNull(oneTodoDataFromRDBMS);
    }

    @Test
    void testFunctionUpdateTodoOnDatabase() {
        List<Todo> alotOfTodo = this.createAlotOfTodo(
                "Membuka Facebook",
                "Memberi reaksi pada postingan",
                "Nonton Reels",
                "Membuka Grup Omkegas rimsvek",
                "Membuka Grup GFL Konawe"
        );

        while (!alotOfTodo.isEmpty()) {
            this.todolistRepositoryAbstractClass.insertOneTodolistToRDBMS(alotOfTodo.removeFirst());
        }

        this.pauseProgramForSomeSeconds(15);

        boolean membukaGrupBiskuitGosong = todolistRepositoryAbstractClass.updateTodolist(
                todolistRepositoryAbstractClass.lastIndexValueThatBeenInserted(),
                new Todo(todolistRepositoryAbstractClass.lastIndexValueThatBeenInserted(),
                        "Membuka Grup Biskuit Gosong"));

        assertTrue(membukaGrupBiskuitGosong);
    }
}