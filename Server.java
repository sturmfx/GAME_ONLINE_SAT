package com.company;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread
{
    int port;

    public Server(int port)
    {
        this.port = port;
    }

    @Override
    public void run()
    {
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(this.port);
            while(true)
            {
                Socket socket = null;
                socket = server.accept();
                Game.connection_list.add(new ServerConnection(socket));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
