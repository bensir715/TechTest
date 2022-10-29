package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class FareInfoTableModel extends AbstractTableModel {
    private List<FareInfo> fareInfoList;
    private static String[] columns = {"Trial No.", "Distance Traveled", "Traveled Unit", "Cost Per Distance Traveled", "Calculated Fare Cost"};
    private static final Class[] columnClass = new Class[] {Integer.class, Integer.class, Integer.class, Integer.class, Integer.class};

    public FareInfoTableModel(List<FareInfo> fareInfoList) {
        this.fareInfoList = fareInfoList;
    }

    @Override
    public int getRowCount() {
        return fareInfoList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){
        return columnClass[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex + 1;
            case 1:
                return fareInfoList.get(rowIndex).getTraveledDistance();
            case 2:
                return fareInfoList.get(rowIndex).getTraveledUnit();
            case 3:
                return fareInfoList.get(rowIndex).getCostPerDisTraveled();
            case 4:
                return fareInfoList.get(rowIndex).getFareCost();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        // not editable
        return false;
    }

    public void addRow(FareInfo fareInfo){
        this.fareInfoList.add(fareInfo);
    }
}
