package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;

public interface TodolistService {

    void showTodolist();

    Todo addTodo(String todo);

    Todo modifyTodo(Integer todoId, String todo);

    Todo showOneTodolist(String todoId);

    Todo removeTodo(Integer todoId);

    boolean isTodoWithIndexExist(Integer number);
}
