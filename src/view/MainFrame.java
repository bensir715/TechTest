package view;

import controller.GeneralController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int MAIN_WIDTH = 1000;
    public static final int MAIN_HEIGHT = 800;

    private CardLayout cardLayout;

    public MainFrame() {
        this.setTitle("Fare Calculation Application");
        this.cardLayout = new CardLayout();
        AddDriverForm addDriverForm = new AddDriverForm();
        DriverRecord driverRecord = new DriverRecord();
        FareInfoRecord fareInfoRecord = new FareInfoRecord();
        setLayout(cardLayout);

        GeneralController controller = new GeneralController(this, addDriverForm, driverRecord, fareInfoRecord);

        add(addDriverForm, "add form");
        add(driverRecord, "driver record");
        add(fareInfoRecord, "fareInfo record");

        setSize(MAIN_WIDTH, MAIN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }
}
