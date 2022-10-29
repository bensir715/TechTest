package view;

import model.Driver;
import model.DriverTableModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DriverRecord extends JPanel {
    private DriverTableModel driverTableModel;
    private JTable driverTable;

    private JButton viewAddDriverButton;
    private JButton deleteDriverButton;
    private JButton calFareButton;
    private JButton viewFareRecordButton;

    public DriverRecord() {
       TitledBorder border = BorderFactory.createTitledBorder("Driver Profiles");
       this.setBorder(border);
       setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

       List<Driver> driverList = new ArrayList<Driver>();
       this.driverTableModel = new DriverTableModel(driverList);
       this.driverTable = new JTable(driverTableModel);
       JScrollPane scrollDriverRecord = new JScrollPane(driverTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       add(scrollDriverRecord);

       Dimension buttonSize = new Dimension(500, 20);
       this.viewAddDriverButton = new JButton("Add Driver");
       this.viewAddDriverButton.setMaximumSize(buttonSize);
       this.deleteDriverButton = new JButton("Delete Driver");
       this.deleteDriverButton.setMaximumSize(buttonSize);
       this.calFareButton = new JButton("Calculate Fare");
       this.calFareButton.setMaximumSize(buttonSize);
       this.viewFareRecordButton = new JButton("Fare History");
       this.viewFareRecordButton.setMaximumSize(buttonSize);

       JPanel buttonPanel = new JPanel();

       buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
       buttonPanel.add(viewAddDriverButton);
       buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
       buttonPanel.add(deleteDriverButton);
       buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
       buttonPanel.add(calFareButton);
       buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
       buttonPanel.add(viewFareRecordButton);
       buttonPanel.add(Box.createRigidArea(new Dimension(0, 30)));

       add(buttonPanel);
    }

    // getter
    public JTable getDriverTable() {
        return driverTable;
    }

    public JButton getViewAddDriverButton() {
        return viewAddDriverButton;
    }

    public JButton getDeleteDriverButton() {
        return deleteDriverButton;
    }

    public JButton getCalFareButton() {
        return calFareButton;
    }

    public JButton getViewFareRecordButton() {
        return viewFareRecordButton;
    }
}
