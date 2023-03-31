package org.example.Task_Chat.Day4;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box(5, 10, 15);
        Box box1 = new Box(10, 15, 20);
        Box box2 = new Box();
        Box box3 = new Box();
        double volBox, volBox1, volBox2, volBox3;
        box2.setDim(2, 3, 4);
        box3.setDim(8, 7, 5);
        volBox = box.volume();
        volBox1 = box1.volume();
        volBox2 = box2.volume();
        volBox3 = box3.volume();
        System.out.println("Objętość pudełka box = " + volBox);
        System.out.println("Objętość pudełka box1 = " + volBox1);
        System.out.println("Objętość pudełka box2 = " + volBox2);
        System.out.println("Objętość pudełka box3 = " + volBox3);
    }
}
