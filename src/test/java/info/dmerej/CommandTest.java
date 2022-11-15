package info.dmerej;

import info.dmerej.enums.TaskStatus;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    @Test
    void command_add_task() {
        var taskManager = new TaskManager();

        taskManager.addCreatedTask("Ma nouvelle tâche");

        var expectedCreatedTask = new Task("Ma nouvelle tâche", 1, TaskStatus.TODO);
        assertEquals(taskManager.tasks, List.of(expectedCreatedTask));
    }
}
