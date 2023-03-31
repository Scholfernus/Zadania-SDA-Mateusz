package org.example.Task_Chat.Day4;

public class Fish extends AnimalChatTask {
    private String water;

    public Fish(String name, int age, String species, String water) {
        super(name, age, species);
        this.water = water;
    }

    @Override
    public String toString() {
        return "Fish {" +
                "water='" + water + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("No sound");
    }
}
