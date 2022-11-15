package info.dmerej;

import info.dmerej.enums.TaskStatus;

import java.util.Objects;

public final class Task {
    private final String description;
    private final int id;

    private TaskStatus status;

    public Task(String description, int id, TaskStatus status) {
        this.description = description;
        this.id = id;
        this.status = status;
    }

    public Task(String description, int id) {
        this(description, id, TaskStatus.TODO);
    }

    public String description() {
        return description;
    }

    public int id() {
        return id;
    }

    public TaskStatus status() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Task) obj;
        return Objects.equals(this.description, that.description) &&
                this.id == that.id &&
                Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, status);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, status, description);
    }
}
