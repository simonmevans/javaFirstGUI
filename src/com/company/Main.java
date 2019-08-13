package com.company;

import java.awt.*;
import java.awt.event.*;

public abstract class Main extends Frame implements ActionListener, WindowListener, MouseListener, MouseMotionListener {
    //mouse counter
    private Label labelOne;
    private TextField textFieldOne;
    private int count = 0;
    private Button buttonOne;
    //mouse click
    private TextField TFxclick;
    private TextField TFyclick;
    private Label labelxClick;
    private Label labelyClick;
    //mouse drag
    private TextField TFxdrag;
    private TextField TFydrag;
    private Label labelxDrag;
    private Label labelyDrag;

    Main() {
        //set up frame
        setLayout(new FlowLayout());
        setTitle("Intro To Java GUI");
        setSize(141, 500);
        //set up for button click
        labelOne = new Label("Button Clicks");
        add(labelOne);
        textFieldOne = new TextField(count + "", 10);
        textFieldOne.setEditable(false);
        add(textFieldOne);
        buttonOne = new Button("Click Me to Add One");
        buttonOne.addActionListener(this);
        add(buttonOne);
        //closes winow
        addWindowListener(this);
        //setup for x/y click
        addMouseListener(this);
        labelxClick = new Label("X click: ");
        add(labelxClick);
        TFxclick = new TextField(3);
        add(TFxclick);
        labelyClick = new Label("Y click: ");
        add(labelyClick);
        TFyclick = new TextField(3);
        add(TFyclick);
        //setup for x/y drag
        addMouseMotionListener(this);
        labelxDrag = new Label("X drag: ");
        add(labelxDrag);
        TFxdrag = new TextField(3);
        add(TFxdrag);
        labelyDrag = new Label("Y drag: ");
        add(labelyDrag);
        TFydrag = new TextField(3);
        add(TFydrag);

        //set all visable true
        setVisible(true);


    }

    public static void main(String[] args) {
        new Main() {};
        System.out.println("test");
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count;
        textFieldOne.setText(count + "");
    }

    @Override
    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        TFxclick.setText(evt.getX() + "");
        TFyclick.setText(evt.getY() + "");

    }

    @Override
    public void mouseMoved(MouseEvent event) {
        TFxdrag.setText(event.getX() + "");
        TFydrag.setText(event.getY() + "");
    }

    @Override
    public void mouseDragged(MouseEvent event) {
    }

    ;

    //dumb functions
    @Override
    public void windowIconified(WindowEvent evt) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent evt) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent evt) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent evt) {
        System.out.println("Window Deactivated");
    }

    @Override
    public void mousePressed(MouseEvent evt) {
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
    }

    @Override
    public void mouseEntered(MouseEvent evt) {
    }

    @Override
    public void mouseExited(MouseEvent evt) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }
}