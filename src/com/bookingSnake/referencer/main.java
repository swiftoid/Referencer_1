package com.bookingSnake.referencer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;

/**
 * Created by swi94000733 on 01/12/2015.
 */
public class main {
    public static String direct;

    public static void main (String args[]) throws IOException {

        String current = new java.io.File( "." ).getCanonicalPath();
        direct = current;
       JFrame_box();


    }


    public static void JFrame_box() {
        System.out.println("starting form");
        JFrame frame = new JFrame("test");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);


        JPanel header = new JPanel();
        header.setBackground(Color.decode("#2d2d2f"));
        header.setPreferredSize(new Dimension(700, 50));

        // Set the logo image & panel
        JPanel logo_panel = new JPanel();
        logo_panel.setPreferredSize(new Dimension(100, 50));
        logo_panel.setBackground(Color.decode("#2d2d2f"));
        JLabel pn = new JLabel("Image here");
        pn.setForeground(Color.decode("#FFFFFF"));


        JButton btn_web = new JButton("Website");
        JButton btn_book = new JButton("Book");
        JButton btn_blog = new JButton("Blog");
        JButton btn_art = new JButton("Article");

        JTextPane Author = new JTextPane();

        // Set content panel
        JPanel content = new JPanel();
        content.setBackground(Color.decode("#FFFFFF"));
        content.setPreferredSize(new Dimension(700, 250));

        //Add items to HEADER panels

        logo_panel.add(pn);

        header.add(logo_panel);
        header.add(btn_web);
        header.add(btn_book);
        header.add(btn_blog);
        header.add(btn_art);

        content.add(Author);

        //Add all panels to Frame
        frame.add(header);
        frame.add(content);

        // complete the form
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
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
        //ImageIcon crown = new ImageIcon(direct + "/src/com/bookingSnake/referencer/crown.png");
        //JLabel pn = new JLabel(crown);
        //pn.setBounds(0,0,50,50);

        JPanel content = new JPanel();
        content.setBackground(Color.decode("#000000"));
        content.setBounds(0,50,700, 250);

    //Add all items to Panels
        //header.add(pn);

    //Add all panels to Frame
        frame.add(header);
        frame.add(content);

    }
}
