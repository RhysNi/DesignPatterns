package com.rhys.designpatterns.observer.v9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/16 12:16 上午
 */
public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new MyActionListener1());
        button.addActionListener(new MyActionListener2());
        button.buttonPressed();
    }
}

class Button {
    private List<ActionListener> actionListeners = new ArrayList<>();

    public void buttonPressed() {
        ActionEvent actionEvent = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListeners.size(); i++) {
            ActionListener actionListener = actionListeners.get(i);
            actionListener.actionPerformed(actionEvent);
        }
    }

    public void addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
    }
}

interface ActionListener {
    void actionPerformed(ActionEvent actionEvent);
}

class MyActionListener1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Button pressed1");
    }
}

class MyActionListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Button pressed2");
    }
}

class ActionEvent {
    long whern;
    Object source;

    public ActionEvent(long whern, Object source) {
        this.whern = whern;
        this.source = source;
    }

    public long getWhern() {
        return whern;
    }

    public void setWhern(long whern) {
        this.whern = whern;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}

