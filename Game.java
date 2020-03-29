package com.company;
import java.util.ArrayList;
public class Game
{
    static int port = 7777;
    static int speed = 100;
    static int tick = 10;
    static boolean go = true;

    static Server server;
    static ArrayList<ServerConnection> connection_list = new ArrayList<>();

    public static void main(String[] args)
    {
        server = new Server(port);
        go();
    }

    public static void go()
    {
        while(go)
        {
            //HERE WILL BE GAME LOGIC
        }
    }

    public static Message getMessage()
    {
        Message msg = null;
        return msg;
    }
}
