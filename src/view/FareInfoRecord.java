package view;

import model.FareInfo;
import model.FareInfoTableModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FareInfoRecord extends JPanel {
    private FareInfoTableModel fareInfoTableModel;
    private JTable fareInfoTable;

    private JButton driverViewButton;

    public FareInfoRecord() {
        TitledBorder border = BorderFactory.createTitledBorder("Fare Calculation History");
        this.setBorder(border);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        List<FareInfo> fareInfoList = new ArrayList<FareInfo>();
        this.fareInfoTableModel = new FareInfoTableModel(fareInfoList);
        this.fareInfoTable = new JTable(fareInfoTableModel);
        JScrollPane scrollDriverRecord = new JScrollPane(fareInfoTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollDriverRecord);

        Dimension buttonSize = new Dimension(150, 20);
        this.driverViewButton = new JButton("View Driver Profiles");
        this.driverViewButton.setMaximumSize(buttonSize);

        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        buttonPanel.add(driverViewButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        add(buttonPanel);
    }

    // getter
    public FareInfoTableModel getFareInfoTableModel() {
        return fareInfoTableModel;
    }

    public JTable getFareInfoTable() {
        return fareInfoTable;
    }

    public JButton getDriverViewButton() {
        return driverViewButton;
    }
}
