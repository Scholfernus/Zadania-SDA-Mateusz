package org.example.Task_Chat.Day4;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void setDim(double szer, double wys, double gleb) {
        this.width = szer;
        this.height = wys;
        this.depth = gleb;
    }

    public Box() {
    }

    double volume() {
        return width * height * depth;
    }
}
