package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.view;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepository;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepositoryImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistService;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistServiceImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util.DatabaseConnectionUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class TodolistViewConsoleImplementationTest {
    private HikariDataSource hikariDataSource;
    private TodolistRepository todolistRepository;
    private TodolistService todolistService;
    private TodolistViewConsoleImplementation todolistViewImplementation;

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

    @BeforeEach
    void setUp() {
        this.hikariDataSource = DatabaseConnectionUtil.getDataSource();
        this.todolistRepository = new TodolistRepositoryImplementation(this.hikariDataSource);
        this.todolistService = new TodolistServiceImplementation(this.todolistRepository);
        this.todolistViewImplementation = new TodolistViewConsoleImplementation(this.todolistService);
        this.seedTheDatabase();
    }

    @AfterEach
    void tearDown() {
        this.resetDatabaseState();
    }

    @AfterAll
    static void afterAll() {
        TodolistViewConsoleImplementationTest todolistViewTest = new TodolistViewConsoleImplementationTest();
        todolistViewTest.hikariDataSource.close();
    }

    @Test
    void addTodolist() {
        this.todolistViewImplementation.addTodolist();
    }
}