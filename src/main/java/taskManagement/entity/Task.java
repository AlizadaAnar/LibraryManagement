package taskManagement.entity;

import taskManagement.priority.PriorityLevel;

public class Task {

    private String taskName;

    private PriorityLevel priorityLevel;

    public Task(String taskName, PriorityLevel priorityLevel) {
        this.taskName = taskName;
        this.priorityLevel = priorityLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
