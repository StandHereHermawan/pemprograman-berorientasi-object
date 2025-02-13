package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepository;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepositoryImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistService;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistServiceImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.view.TodolistView;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.view.TodolistViewConsoleImplementation;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util.DatabaseConnectionUtil;

import javax.sql.DataSource;

public class TodoApp {
    private DataSource dataSource;
    private TodolistRepository todolistRepository;
    private TodolistService todolistService;
    private TodolistView todolistView;

    public static void run() {
        TodoApp todoApp = new TodoApp();
        todoApp.dataSource = DatabaseConnectionUtil.getDataSource();
        todoApp.todolistRepository = new TodolistRepositoryImplementation(todoApp.dataSource);
        todoApp.todolistService = new TodolistServiceImplementation(todoApp.todolistRepository);
        todoApp.todolistView = new TodolistViewConsoleImplementation(todoApp.todolistService);
        todoApp.todolistView.showToDoList();
    }

    public static void main(String[] args) {
        TodoApp.run();
    }
}
