package org.example.Karol;

import java.time.LocalDate;

public class ExampleProject {
    public static void main(String[] args) {
        Tascs list = new Tascs();
        ToDoList nowaLista1 = new ToDoList("zadanie 1", LocalDate.of(2023, 02, 15), 8);
        list.addToDoList(0, nowaLista1);
        ToDoList nowaLista2 = new ToDoList("zadanie 2", LocalDate.of(2023, 03, 25), 5);
        list.addToDoList(1, nowaLista2);
        ToDoList nowaLista3 = new ToDoList("zadanie 3", LocalDate.of(2023, 04, 10), 3);
        list.addToDoList(2, nowaLista3);

    ToDoList retrieved = list.getToDoItem(0); // Kod o prostej konstrukcji, wyciąga dane tylko żądanego indeksu, w tym przypadku infeks 0
        System.out.println(retrieved);
        //System.out.println("Name: " + retrieved.name + " Termin realizacji: " + retrieved.deadLine + " priorytet: " + retrieved.priority);
        // Dzięki zastosowaniu klasy String ominąłem pisanie długiego kodu
    ToDoList[] tablicaZadan = list.doLists;
        for (ToDoList toDoListPetla : tablicaZadan) {
            System.out.println(toDoListPetla);
            //System.out.println("Name: " + toDoListPetla.name + " Termin realizacji: " + toDoListPetla.deadLine + " priorytet: " + toDoListPetla.priority);
        }

    }
}
