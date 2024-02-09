package taskManagement;

import taskManagement.PriorityLevel;
import taskManagement.TaskManager;
import taskManagement.Main;
import taskManagement.DuplicateTaskException;
import taskManagement.Task;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        try {
            taskManager.add(new Task("Biology", PriorityLevel.LOW));
            taskManager.add(new Task("Chemistry", PriorityLevel.MEDIUM));
            taskManager.add(new Task("Math", PriorityLevel.HIGH));
            taskManager.add(new Task("English", PriorityLevel.HIGH));
        } catch (DuplicateTaskException exception) {
            System.out.println("Error: " + exception.getMessage());
        }


        taskManager.printAllTask();
        System.out.println();

        System.out.println("Processing...");
        System.out.println("Displaying Tasks by Priority: ");
        taskManager.displayTaskByPriority(PriorityLevel.HIGH);

        System.out.println();
        System.out.println("Removing specified datas: ");
        taskManager.removeTask("CJANcdscjsk");

        System.out.println();
        taskManager.printAllTask();
    }
}
