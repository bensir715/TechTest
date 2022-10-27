package model;

import java.util.ArrayList;
import java.util.List;

public class DummyDb {
    List<Driver> driverList;

    public DummyDb() {
        this.driverList = new ArrayList<Driver>();
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }
}
