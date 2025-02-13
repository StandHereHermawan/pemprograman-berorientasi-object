package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;

import java.util.List;

public abstract class TodolistRepositoryAbstractClass {

    abstract public List<Todo> getAllTodolistInDatabaseNotYetDeleted();

    abstract public Todo insertOneTodolistToRDBMS(Todo todo);

    abstract public Todo getOneTodolistDataFromRDBMS(Integer todolistId);

    abstract public boolean removeTodolistById(Integer todolistId);

    abstract public int lastIndexValueThatBeenInserted();

    abstract public boolean updateTodolist(Integer idTodo, Todo todo);

    abstract public boolean isTodoWithThisIndexExist(Integer todoIndex);
}
