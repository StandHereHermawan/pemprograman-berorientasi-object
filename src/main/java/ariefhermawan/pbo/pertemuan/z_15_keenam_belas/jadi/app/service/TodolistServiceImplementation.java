package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.repository.TodolistRepository;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class TodolistServiceImplementation
        extends TodolistServiceAbstractClass
        implements TodolistService {

    private List<Todo> listOfTodo;

    private final TodolistRepository todolistRepository;

    public TodolistServiceImplementation(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
        this.listOfTodo = todolistRepository
                .getAllTodolistInDatabaseNotYetDeleted();
    }

    private String todoWithDateTimeInfo(Todo todo) {
        return "\t\t" +
                todo.getId() + ". " +
                todo.getTodo() + ". " +
                "Created At: " +
                todo.getCreatedAt().getDayOfWeek() + " " +
                todo.getCreatedAt()
                        .toLocalTime().plusHours(7)
                        .format(DateTimeFormatter.ofPattern("HH:mm")) +
                ", " +
                todo.getCreatedAt().getMonth() + " " +
                todo.getCreatedAt().getYear() +
                ", " +
                "Updated At: " +
                todo.getUpdatedAt().getDayOfWeek() + " " +
                todo.getUpdatedAt()
                        .toLocalTime().plusHours(7)
                        .format(DateTimeFormatter.ofPattern("HH:mm")) +
                ", " +
                todo.getUpdatedAt().getMonth() + " " +
                todo.getUpdatedAt().getYear() +
                ".";
    }

    @Override
    public void showTodolist() {
        this.listOfTodo = this.todolistRepository.getAllTodolistInDatabaseNotYetDeleted();

        System.out.println("\t" + "TO DO LIST");

        if (!this.listOfTodo.isEmpty()) {
            this.listOfTodo.stream().forEach(todo -> {
                System.out.println(this.todoWithDateTimeInfo(todo));
            });
        } else {
            System.out.println("\t\t" + "Belum ada to do.");
        }
    }

    @Override
    public Todo showOneTodolist(String todoId) {
        Todo todo = this.todolistRepository.getOneTodolistDataFromRDBMS(Integer.parseInt(todoId));
        return todo;
    }

    @Override
    public Todo addTodo(String todoData) {
        Todo todo = new Todo();
        todo.setTodo(todoData);
        this.todolistRepository.insertOneTodolistToRDBMS(todo);
        return todo;
    }

    @Override
    public Todo modifyTodo(Integer todoId, String todo) {
        Todo savedTodo = new Todo();
        String todoData;

        var todolistFromRDBMS = todolistRepository.getOneTodolistDataFromRDBMS(todoId);
        todolistFromRDBMS.setTodo(todo);

        boolean operationSuccess = todolistRepository.updateTodolist(todoId, todolistFromRDBMS);
        todoData = operationSuccess ? todo : null;

        savedTodo.setId(todoId);
        savedTodo.setTodo(todoData);
        return savedTodo;
    }

    @Override
    public Todo removeTodo(Integer number) {
        return todolistRepository.removeTodoById(number);
    }

    @Override
    public boolean isTodoWithIndexExist(Integer todoIndex) {
        return this.todolistRepository.isTodoWithThisIndexExist(todoIndex);
    }
}
