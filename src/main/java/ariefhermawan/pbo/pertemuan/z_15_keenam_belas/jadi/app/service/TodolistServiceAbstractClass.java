package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;

public abstract class TodolistServiceAbstractClass {

    abstract public void showTodolist();

    abstract public Todo addTodo(String todo);

    abstract public Todo modifyTodo(Integer todoId, String todo);

    abstract public Todo removeTodo(Integer todoId);

    abstract public Todo showOneTodolist(String todoId);

    abstract public boolean isTodoWithIndexExist(Integer number);
}
