package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Vasketøj","Jeg skal nå at vaske mit tøj inden fredag", LocalDate.of(2025, 8, 29));
        GardenTask task2 = new GardenTask("Mælkebøtter", "Jeg skal pluk mælkebøtter til mine skildpadder" , LocalDate.of(2025,8,25), "Daniels have");
        Task task3 = new Task("Kreatin", "Løbet tør for kreatin, køb på 17nutrition", LocalDate.of(2025, 8, 23));

        List<Task> tasks = new ArrayList<>();


        TaskList taskList = new TaskList(tasks);

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);



        System.out.println('\n'+"Filtrer efter keyword i beskrivelse (skildpadder)"+taskList.filterTask("skildpadder")+'\n');

        System.out.println("Sorter efter dueDate: "+taskList.sortTaskByDueDate()+ '\n');

        System.out.println("Alle task der til i dag: "+taskList.getTaskDueToday()+ '\n');

        System.out.println("Alle task der er udløbet: "+taskList.getTaskOverdueToday()+ '\n');

        System.out.println("Alle task der ikke er udløbet: "+taskList.getAllNonExpiredTask()+ '\n');


        System.out.println("Alle task -------------------------------------");
        taskList.printAllTask();





    }
}