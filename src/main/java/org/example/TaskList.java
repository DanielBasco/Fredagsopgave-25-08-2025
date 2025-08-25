package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TaskList<T extends Task> implements Iterable<T>{



    private List<T> taskList = new ArrayList<T>();

    public TaskList(List<T> taskList){
        this.taskList = taskList;
    }

    public List<T> getTaskList(){
        return taskList;
    }

/*
    Add tasks to the list. //
    Filter tasks based on a keyword in the title or description.
    Sort tasks by due date. //
    Get tasks that are due today. //
    Get tasks that are overdue. //
    Print the list of tasks.
*/

    //  Add tasks to the list.
public void addTask(T task){
    taskList.add(task);
}

   // Filter tasks based on a keyword in the title or description. (Ikke testet endnu)
    public List<T> filterTask(String keyword){
    return taskList.stream().filter(task -> task.getDescription().contains(keyword)).collect(Collectors.toList());
    }

    //Sort tasks by due date.
    public List<T> sortTaskByDueDate(){
    return taskList.stream().sorted(Comparator.comparing(Task::getDuedate)).collect(Collectors.toList());
    }

    // Get tasks that are due today.
    public List<T> getTaskDueToday(){
    LocalDate today = LocalDate.now();
    return taskList.stream().filter(task -> task.getDuedate().isEqual(today)).collect(Collectors.toList());
    }

    //Get tasks that are overdue.
    public List<T> getTaskOverdueToday(){
    LocalDate today = LocalDate.now();
    return taskList.stream().filter(task -> task.getDuedate().isBefore(today)).collect(Collectors.toList());
    }

    public List<T> getAllNonExpiredTask(){
    LocalDate today = LocalDate.now();

    return taskList.stream().filter(task -> task
            .getDuedate().isEqual(today) || task.getDuedate().isAfter(today)).collect(Collectors.toList());
    }


    public void printAllTask(){
    forEach(task -> System.out.println(task.toString()));
    }


    @Override
    public Iterator<T> iterator() {
        return taskList.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
