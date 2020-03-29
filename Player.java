package com.company;
import java.io.Serializable;
public class Player implements Serializable
{
    int id;
    int team_id;
    int color;
    int max_hp;
    int hp;
    String username;
    double x;
    double y;

    public Player(int id, int team_id, int color, int max_hp, int hp, String username, double x, double y)
    {
        this.id = id;
        this.team_id = team_id;
        this.color = color;
        this.max_hp = max_hp;
        this.hp = hp;
        this.username = username;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getMax_hp() {
        return max_hp;
    }

    public void setMax_hp(int max_hp) {
        this.max_hp = max_hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
