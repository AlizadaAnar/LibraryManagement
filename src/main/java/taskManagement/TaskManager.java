package taskManagement;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void add(Task task) throws DuplicateTaskException {
        for (Task t : tasks) {
            if (t.getTaskName().equals(task.getTaskName())) {
                System.out.println("Task with name: '" + task.getTaskName() + "' already exists");
            }
        }
        tasks.add(task);
    }

    public void displayTaskByPriority(PriorityLevel priorityLevel) {
        for (Task t : tasks) {
            if (t.getPriorityLevel() == priorityLevel) {
                System.out.println("We have found new Data:");
                System.out.println(t.getTaskName() + ", " + t.getPriorityLevel());
            }
        }
    }

    public void removeTask(String name) {
        try {
            if (!tasks.removeIf(task -> task.getTaskName().equals(name))) {
                throw new NoSuchFieldException();
            }
        } catch (Exception ex) {
            System.out.println("This task doesn't exists my friend");
        }
    }


    public void printAllTask() {
        for (Task t : tasks) {
            System.out.println("TaskName: " + t.getTaskName() + ",  PriorityLevel: " + t.getPriorityLevel());
        }
    }
}
