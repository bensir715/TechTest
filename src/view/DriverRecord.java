package view;

import model.Driver;
import model.DriverTableModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DriverRecord extends JPanel {
    private DriverTableModel driverTableModel;
    private JTable driverTable;

    public DriverRecord() {
       setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

       List<Driver> driverList = new ArrayList<Driver>();
       driverList.add(new Driver("a", "b", "c", "d", 1, 2));
       this.driverTableModel = new DriverTableModel(driverList);
       this.driverTable = new JTable(driverTableModel);
       JScrollPane scrollDriverRecord = new JScrollPane(driverTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       add(scrollDriverRecord);
    }

    public void loadDriver(List<Driver> driverList){
        for(Driver driver : driverList){
            this.driverTableModel.addRow(driver);
        }
        this.driverTable.setModel(this.driverTableModel);
    }
}
