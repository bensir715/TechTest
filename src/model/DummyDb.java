package model;

import java.util.ArrayList;
import java.util.List;

public class DummyDb {
    private List<Driver> driverList;
    private List<FareInfo> fareInfoList;

    public DummyDb() {
        this.driverList = new ArrayList<Driver>();
        this.fareInfoList = new ArrayList<FareInfo>();
    }

    // getter and setter
    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public List<FareInfo> getFareInfoList() {
        return fareInfoList;
    }

    public void setFareInfoList(List<FareInfo> fareInfoList) {
        this.fareInfoList = fareInfoList;
    }
}
