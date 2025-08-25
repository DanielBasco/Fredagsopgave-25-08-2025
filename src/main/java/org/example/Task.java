package org.example;

import java.time.LocalDate;

public class Task {



    public Task(String task, String description, LocalDate duedate) {
        this.task = task;
        this.description = description;
        this.duedate = duedate;
    }

    private String task;
    private String description;
    private LocalDate duedate;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }



    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", description='" + description + '\'' +
                ", duedate=" + duedate +
                '}';
    }
}
