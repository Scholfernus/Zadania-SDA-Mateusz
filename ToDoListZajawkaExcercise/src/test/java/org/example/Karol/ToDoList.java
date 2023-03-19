package org.example.Karol;

import java.time.LocalDate;

public class ToDoList {
    String name;
    LocalDate deadLine;
    int priority;

    ToDoList(String name, LocalDate deadLine, int priority) {
        this.name = name;
        this.deadLine = deadLine;
        this.priority = priority;
    }

    public String toString() {
        return  "Name: " + name + " Termin realizacji: " + deadLine + " priorytet: " + priority;
    }
}

