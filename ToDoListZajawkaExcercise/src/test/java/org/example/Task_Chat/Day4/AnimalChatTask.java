package org.example.Task_Chat.Day4;

abstract class AnimalChatTask {
    public String name;
    public int age;
    public String species;

    public AnimalChatTask(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void makeNoise() {
        System.out.println("Animal make a sound: ");
    }
}


