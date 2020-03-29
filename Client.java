package com.company;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class Client
{
    static String ip_string = "localhost";
    static String username = "sturmfx";
    static Color[]  colors = {Color.BLUE, Color.CYAN, Color.GREEN, Color.RED, Color.YELLOW, Color.DARK_GRAY, Color.BLACK, Color.PINK};
    static int player_raadius = 20;
    static Socket socket;
    static ObjectOutputStream oos;
    static ObjectInputStream ois;
    static ReadMessage rm;
    static Graphics2D g2d;
    static JFrame main = new JFrame("GAME ONLINE");
    static Canvas canvas = new Canvas();

    public static void main(String[] args) throws IOException
    {
        canvas.setSize(1200, 600);
        main.add(canvas);
        main.pack();
        init();
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void init() throws IOException
    {
        socket = new Socket(ip_string, 7777);
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
        canvas.createBufferStrategy(4);
        g2d = (Graphics2D) canvas.getBufferStrategy().getDrawGraphics();
        rm = new ReadMessage();
        rm.start();
    }

    private static class ReadMessage extends Thread
    {
        @Override
        public void run()
        {
            Message msg;
            try
            {
                while(true)
                {

                    msg = (Message) ois.readObject();
                    g2d.clearRect(0, 0 ,1200, 600);
                    for(Player p : msg.players)
                    {
                        g2d.setColor(colors[p.color]);
                        //HERE WILL BE DRAWING OF PLAYER
                    }
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }
}
