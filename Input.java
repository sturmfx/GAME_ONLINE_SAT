package com.company;

import java.io.Serializable;

public class Input implements Serializable
{
    int id;
    double x;
    double y;
    int direction = 5;

    public Input(int id, double x, double y, int direction)
    {
        this.id = id;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
