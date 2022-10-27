package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DriverTable extends AbstractTableModel {
    private List<Driver> driverList;

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
