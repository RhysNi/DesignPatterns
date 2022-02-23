package com.rhys.designpatterns.observer.v9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 12:09 上午
 */
public class AWTFrame extends Frame {
    public static void main(String[] args) {
        new AWTFrame().launch();
    }

    public void launch() {
        java.awt.Button button = new java.awt.Button("点击");
        button.addActionListener(new MyActionListener1());
        button.addActionListener(new MyActionListener2());
        this.add(button);
        this.pack();

        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    private class MyActionListener1 implements ActionListener {

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button pressed1");
        }
    }

    private class MyActionListener2 implements ActionListener {

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button pressed2");
        }
    }
}
