package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;

import java.util.List;

public interface TodolistRepository {

    List<Todo> getAllTodolistInDatabaseNotYetDeleted();

    Todo insertOneTodolistToRDBMS(Todo todo);

    Todo removeTodoById(Integer todolistId);

    Todo getOneTodolistDataFromRDBMS(Integer todolistId);

    int lastIndexValueThatBeenInserted();

    boolean updateTodolist(Integer idTodo, Todo todo);

    boolean isTodoWithThisIndexExist(Integer todoIndex);
}
