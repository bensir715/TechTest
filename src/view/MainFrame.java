package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int MAIN_WIDTH = 1200;
    public static final int MAIN_HEIGHT = 800;

    public MainFrame() {
        setLayout(new CardLayout());
        add(new AddDriverForm(), "add form");

        setSize(MAIN_WIDTH, MAIN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
