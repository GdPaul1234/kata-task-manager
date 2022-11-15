package info.dmerej;

import info.dmerej.enums.TaskStatus;

public record Task(String description, int id, TaskStatus status) {
    public Task(String description, int id) {
        this(description, id, TaskStatus.TODO);
    }
}
