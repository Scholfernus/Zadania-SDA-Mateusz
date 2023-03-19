package org.example.Karol;

public class Tascs {
    ToDoList [] doLists = new ToDoList[3];
    void addToDoList(int where, ToDoList next){
    doLists [where] = next;
    }
    ToDoList getToDoItem(int index){
        ToDoList item = doLists[index];
        return item;
    }
}
