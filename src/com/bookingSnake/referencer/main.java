package com.bookingSnake.referencer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by swi94000733 on 01/12/2015.
 */
public class main {
    public static String direct;

    public static void main (String args[]) throws IOException {

        String current = new java.io.File( "." ).getCanonicalPath();
        direct = current;
       JFrame_null();


    }


    public static void JFrame_box() {
        System.out.println("starting form");
        JFrame frame = new JFrame("test");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700, 300);
        frame.setVisible(true);
        frame.setResizable(false);


        JPanel header = new JPanel();
        header.setBackground(Color.decode("#2d2d2f"));
        header.setSize(new Dimension(700, 100));

        JPanel content = new JPanel();
        content.setBackground(Color.decode("#000000"));
        content.setSize(new Dimension(700, 200));


        //Add all panels to Frame
        frame.add(header);
        frame.add(content);
    }

    public static void JFrame_null() {

        System.out.println("starting form: " + direct);
        JFrame frame = new JFrame("test");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700, 300);
        frame.setVisible(true);
        frame.setResizable(false);


        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.decode("#2d2d2f"));
        header.setBounds(0,0,700, 50);
        // Set the logo image
        ImageIcon crown = new ImageIcon(direct + "/src/com/bookingSnake/referencer/crown.png");
        JLabel pn = new JLabel(crown);
        pn.setBounds(0,0,50,50);

        JPanel content = new JPanel();
        content.setBackground(Color.decode("#000000"));
        content.setBounds(0,50,700, 250);

    //Add all items to Panels
        header.add(pn);

    //Add all panels to Frame
        frame.add(header);
        frame.add(content);

    }
}
