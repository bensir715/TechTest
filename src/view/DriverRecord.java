package view;

import model.Driver;
import model.DriverTableModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DriverRecord extends JPanel {
    private DriverTableModel driverTableModel;
    private JTable driverTable;

    private JButton viewAddDriverButton;
    private JButton deleteDriverButton;

    public DriverRecord() {
       setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

       List<Driver> driverList = new ArrayList<Driver>();
       this.driverTableModel = new DriverTableModel(driverList);
       this.driverTable = new JTable(driverTableModel);
       JScrollPane scrollDriverRecord = new JScrollPane(driverTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       add(scrollDriverRecord);

       this.viewAddDriverButton = new JButton("Add Driver");
       this.deleteDriverButton = new JButton("Delete Driver");

       add(viewAddDriverButton);
       add(deleteDriverButton);
    }

    public JTable getDriverTable() {
        return driverTable;
    }

    public JButton getViewAddDriverButton() {
        return viewAddDriverButton;
    }

    public JButton getDeleteDriverButton() {
        return deleteDriverButton;
    }
}
