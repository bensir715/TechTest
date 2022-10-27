package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DriverTable extends AbstractTableModel {
    private List<Driver> driverList;
    private String[] columns = {"Name", "Surname", "Email", "Vehicle Type", "Base Fare Price", "Base Fare Distance"};

    public DriverTable(List<Driver> driverList) {
        this.driverList = driverList;
    }

    @Override
    public int getRowCount() {
        return driverList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return driverList.get(rowIndex).getName();
        } else if (columnIndex == 1) {
            return driverList.get(rowIndex).getSurname();
        } else if (columnIndex == 2) {
            return driverList.get(rowIndex).getEmail();
        } else if (columnIndex == 3) {
            return driverList.get(rowIndex).getVehicleType();
        } else if (columnIndex == 4) {
            return driverList.get(rowIndex).getBaseFarePrice();
        } else if (columnIndex == 5) {
            return driverList.get(rowIndex).getBaseFareDistance();
        }
        return null;
    }
}
