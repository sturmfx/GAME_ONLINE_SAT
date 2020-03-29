package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnection extends Thread
{
    private Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public ServerConnection(Socket socket) throws IOException
    {
        this.socket = socket;
        oos = new ObjectOutputStream(this.socket.getOutputStream());
        ois = new ObjectInputStream(this.socket.getInputStream());
        start();
    }

    @Override
    public void run()
    {
        Message msg;
        try
        {
            while(true)
            {
                msg = Game.getMessage();
                oos.writeObject(msg);
                oos.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
