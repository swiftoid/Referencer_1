package com.bookingSnake.referencer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by swi94000733 on 01/12/2015.
 */
class buttons {


        public buttons() {

            //njhjj
            
            final JFrame frame = new JFrame("The Referencer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
            buttonPanel.add(new JButton("Book"));
            buttonPanel.add(new JButton("Online"));
            buttonPanel.add(new JButton("PDF"));

            JPanel east = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.NORTH;
            gbc.weighty = 1;
            east.add(buttonPanel, gbc);

            JPanel center = new JPanel(){
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(400, 400);
                }
            };
            center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            frame.add(east, BorderLayout.EAST);
            frame.add(center);

            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new buttons();
                }
            });
        }

    }


