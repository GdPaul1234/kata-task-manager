package info.dmerej;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;
    private int nextId = 0;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }

    public void addCreatedTask(String description) {
        var createdTask = new Task(description, ++nextId);
        this.tasks.add(createdTask);
    }

    public Task getTaskById(int id) {
        return tasks.stream()
                .filter(task -> task.id() == id)
                .findFirst()
                .orElse(null);
    }
}
