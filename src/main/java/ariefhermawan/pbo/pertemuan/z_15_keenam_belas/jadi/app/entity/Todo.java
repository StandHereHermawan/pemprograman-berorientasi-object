package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.app.entity;

import java.time.LocalDateTime;

@SuppressWarnings({"LombokSetterMayBeUsed", "LombokGetterMayBeUsed"}) // Annotation biar ga muncul warning di IDE IDEA.
public class Todo {
    private int id;
    private String todo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isDeleted;

    public Todo() {
        this.setId(0);
        this.setTodo("Belum Ada");
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
        this.setDeleted(false);
    }

    public Todo(Integer id, String todo) {
        this.setId(id);
        this.setTodo(todo);
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
        this.setDeleted(false);
    }

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
