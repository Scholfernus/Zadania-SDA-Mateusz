package org.example.Task_Chat.Day4;

public class Cat extends AnimalChatTask {
    private String color;

    public Cat(String name, int age, String species, String color) {
        super(name, age, species);
        this.color = color;
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
