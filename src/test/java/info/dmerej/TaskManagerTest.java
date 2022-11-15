package info.dmerej;

import info.dmerej.enums.TaskStatus;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {
    @Test
    void command_add_task_to_empty_list() {
        var taskManager = new TaskManager();

        taskManager.addCreatedTask("Ma nouvelle tâche");

        var expectedCreatedTask = new Task("Ma nouvelle tâche", 1, TaskStatus.TODO);
        assertEquals(taskManager.tasks, List.of(expectedCreatedTask));
    }

    @Test
    void command_add_task_to_non_empty_list() {
        var taskManager = new TaskManager();

        taskManager.addCreatedTask("Ma nouvelle tâche");
        taskManager.addCreatedTask("Ma deuxième tâche");

        var expectedTaskList = List.of(
                new Task("Ma nouvelle tâche", 1, TaskStatus.TODO),
                new Task("Ma deuxième tâche", 2, TaskStatus.TODO)
        );
        assertEquals(taskManager.tasks, expectedTaskList);
    }

    @Test
    void command_get_task_by_id() {
        var taskManager = new TaskManager();
        taskManager.addCreatedTask("Ma nouvelle tâche");
        taskManager.addCreatedTask("Ma deuxième tâche");
        taskManager.addCreatedTask("Ma troisième tâche");
        var id = 2;

        var expectedTask = new Task("Ma deuxième tâche", 2);
        assertEquals(taskManager.getTaskById(id), expectedTask);
    }
}
