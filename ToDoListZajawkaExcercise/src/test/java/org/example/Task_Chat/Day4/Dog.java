package org.example.Task_Chat.Day4;

public class Dog extends AnimalChatTask {
    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark, Woof");
    }
}

