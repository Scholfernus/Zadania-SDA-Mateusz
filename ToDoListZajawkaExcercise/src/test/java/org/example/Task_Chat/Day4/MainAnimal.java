package org.example.Task_Chat.Day4;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalChatTask cat = new Cat("Marc", 5, "Fish", "gold");
        cat.makeNoise();
        AnimalChatTask doggy = new Dog("Walkie", 5, "spaniel", "meal");
        doggy.makeNoise();
        AnimalChatTask fish = new Fish("Ziggy", 1, "pletwal", "seed");
        fish.makeNoise();
        Cat kitty = new Cat("Buzzy", 8, "pers", "white");
        kitty.makeNoise();
        System.out.println(kitty.toString());
        System.out.println(fish.toString());
        System.out.println(doggy.toString());
    }
}
