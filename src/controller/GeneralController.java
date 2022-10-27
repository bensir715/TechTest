package controller;

import model.Driver;
import model.DummyDb;
import view.AddDriverForm;
import view.DriverRecord;
import view.MainFrame;

public class GeneralController {
    DummyDb dataBase;

    MainFrame mainFrame;
    AddDriverForm addDriverForm;
    DriverRecord driverRecord;

    public GeneralController(MainFrame mainFrame, AddDriverForm addDriverForm, DriverRecord driverRecord) {
        this.dataBase = new DummyDb();

        this.mainFrame = mainFrame;
        this.addDriverForm = addDriverForm;
        this.driverRecord = driverRecord;

        addDriverForm.getAddButton().addActionListener(actionEvent -> {
            String name = addDriverForm.getName();
            String surname = addDriverForm.getSurname();
            String email = addDriverForm.getEmail();
            String vehicleType = addDriverForm.getVehicleType();;
            Integer baseFarePrice = addDriverForm.getBaseFarePrice();
            Integer baseFareDistance = addDriverForm.getBaseFareDistance();

            Driver driver = new Driver(name, surname, email, vehicleType, baseFarePrice, baseFareDistance);

            dataBase.getDriverList().add(driver);

            driverRecord.loadDriver(dataBase.getDriverList());
            mainFrame.add(driverRecord, "driver record");

            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "driver record");
        });
    }
}
