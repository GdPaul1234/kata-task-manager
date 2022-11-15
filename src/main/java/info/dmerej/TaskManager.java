package info.dmerej;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks;
    int nextId = 0;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addCreatedTask(String description) {
        var createdTask = new Task(description, ++nextId);
        this.tasks.add(createdTask);
    }
}
