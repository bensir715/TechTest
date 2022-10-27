package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DriverTableModel extends AbstractTableModel {
    private List<Driver> driverList;
    private static String[] columns = {"Name", "Surname", "Email", "Vehicle Type", "Base Fare Price", "Base Fare Distance"};
    private static final Class[] columnClass = new Class[] {String.class, String.class, String.class, String.class, Integer.class, Integer.class};
    public DriverTableModel(List<Driver> driverList) {
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
                return driverList.get(rowIndex).getName();
            case 1:
                return driverList.get(rowIndex).getSurname();
            case 2:
                return driverList.get(rowIndex).getEmail();
            case 3:
                return driverList.get(rowIndex).getVehicleType();
            case 4:
                return driverList.get(rowIndex).getBaseFarePrice();
            case 5:
                return driverList.get(rowIndex).getBaseFareDistance();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        Driver editDriver = driverList.get(rowIndex);
        switch(columnIndex ){
            case 0:
                editDriver.setName((String) value);
                break;
            case 1:
                editDriver.setSurname((String) value);
                break;
            case 2:
                editDriver.setEmail((String) value);
                break;
            case 3:
                editDriver.setVehicleType((String) value);
                break;
            case 4:
                editDriver.setBaseFarePrice((Integer) value);
                break;
            case 5:
                editDriver.setBaseFareDistance((Integer) value);
                break;
            default:
                return;
        }
    }

    public void addRow(Driver driver){
        this.driverList.add(driver);
    }
}
