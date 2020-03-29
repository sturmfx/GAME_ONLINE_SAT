package com.company;
import java.io.Serializable;
import java.util.ArrayList;
public class Message implements Serializable
{
    String username;
    ArrayList<Player> players;

    public Message(String username)
    {
        this.username = username;
        players = new ArrayList<>();
    }

    public void add(Player p)
    {
        players.add(p);
    }
}
