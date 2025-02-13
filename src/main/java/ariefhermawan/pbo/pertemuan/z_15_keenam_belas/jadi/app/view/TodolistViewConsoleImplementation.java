package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.view;

import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity.Todo;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.service.TodolistService;
import ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util.ConsoleUtil;

import java.time.format.DateTimeFormatter;

public class TodolistViewConsoleImplementation implements TodolistView {

    private final TodolistService todolistService;

    public TodolistViewConsoleImplementation(TodolistService todolistService) {
        this.todolistService = todolistService;
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

    private void modifyTodoData(String todoIndex) {
        try {
            Todo todoFromDatabase = this.todolistService.showOneTodolist(todoIndex);
            /// System.out.println(this.todoWithDateTimeInfo(todoFromDatabase));

            String todo = ConsoleUtil.input("Masukkan To do Terbaru");
            if (todo.isEmpty()) {
                System.err.println("\t\t" + "To do kosong");
            } else {
                Todo returnedTodo = this.todolistService.modifyTodo(Integer.parseInt(todoIndex), todo);

                String messageResult = returnedTodo.getTodo() != null ?
                        "\t\t" + "SUKSES MENGUBAH KEGIATAN : " +
                                returnedTodo.getId() + ". " +
                                returnedTodo.getTodo()
                        :
                        "\t\t" + "GAGAL MENGUBAH KEGIATAN : " +
                                returnedTodo.getId();
                System.out.println(messageResult);
            }
        } catch (RuntimeException e) {
            System.err.println("\t\t" + "To do kosong");
        }
    }

    public void showToDoList() {
        boolean iterate = true;
        while (iterate) {
            todolistService.showTodolist();

            System.out.println("\t\t" + "Menu");
            System.out.println("\t\t" + "1. Tambah to do.");
            System.out.println("\t\t" + "2. Hapus to do.");
            System.out.println("\t\t" + "3. Ubah to do.");
            System.out.println("\t\t" + "X. Keluar Aplikasi");

            String input = ConsoleUtil.input("Pilih");

            switch (input) {
                case "1" -> addTodolist();
                case "2" -> removeTodolist();
                case "3" -> modifyTodolist();
                case "x", "X" -> iterate = false;
                default -> {
                    System.err.println(
                            "\t\t" + "Nyang bener ngapa?." + "\n" +
                                    "\t\t" + "Perintah tidak dimengerti."
                    );
                }
            }
        }
    }

    public void addTodolist() {
        System.out.println("\t\t" + "MENAMBAH TO DO LIST");
        String inputtedData;

        String todo = ConsoleUtil.input("todo (x jika batal menambah kegiatan)");

        if (todo.equalsIgnoreCase("x")) {
            // batal menambah kegiatan
            System.out.println("\t\t" + "TIDAK JADI MENAMBAH TO DO.");
        } else {
            Todo savedTodo = todolistService.addTodo(todo);
            System.out.println("\t\t" + "SUKSES MENAMBAH KEGIATAN : " + savedTodo.getTodo());
        }
    }

    public void removeTodolist() {
        String message, number;

        System.out.println("\t\t" + "MENGHAPUS TO DO LIST");
        message = "Masukkan nomor Todo Yang Ingin Dihapus. (x jika batal menghapus kegiatan)";
        number = ConsoleUtil.input(message);

        if (number.equals("x")) {
            // batal menghapus kegiatan
            System.out.println("\t\t" + "TIDAK JADI MENGHAPUS TO DO.");
        } else {
            Todo todo = todolistService.removeTodo(Integer.parseInt(number));
            String messageResult = todo.getTodo() != null ?
                    "\t\t" + "SUKSES MENGHAPUS KEGIATAN : " + number + ". " + todo.getTodo() :
                    "\t\t" + "GAGAL MENGHAPUS KEGIATAN : " + number;
            System.out.println(messageResult);
        }
    }

    public void modifyTodolist() {
        String message;
        System.out.println("\t\t" + "MENGUBAH TO DO LIST");

        message = "Pilih nomor to do yang ingin diubah." +
                " (x jika batal menghapus kegiatan)";
        String todoIndex = ConsoleUtil.input(message);

        if (todoIndex.equals("x")) {
            System.out.println("\t\t" + "Tidak jadi mengubah to do.");
        } else if (this.todolistService.isTodoWithIndexExist(Integer.parseInt(todoIndex))) {
            this.modifyTodoData(todoIndex);
        } else {
            System.err.println("\t\t" + "To do tidak ditemukan.");
        }
    }
}
