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
            // retrieve info from addDriverForm
            String name = addDriverForm.getName();
            String surname = addDriverForm.getSurname();
            String email = addDriverForm.getEmail();
            String vehicleType = addDriverForm.getVehicleType();;
            Integer baseFarePrice = addDriverForm.getBaseFarePrice();
            Integer baseFareDistance = addDriverForm.getBaseFareDistance();

            // create new Driver object
            Driver driver = new Driver(name, surname, email, vehicleType, baseFarePrice, baseFareDistance);

            // add Driver to dummy DB
            dataBase.getDriverList().add(driver);

            // load driverList from dummy DB to driverRecord
            driverRecord.loadDriver(dataBase.getDriverList());

            // Renew driverRecord component to mainFrame
            mainFrame.add(driverRecord, "driver record");
            // show new driverRecord component
            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "driver record");
        });

        addDriverForm.getDriverViewButton().addActionListener(actionEvent ->{
            // load driverList from dummy DB to driverRecord
            driverRecord.loadDriver(dataBase.getDriverList());
            // Renew driverRecord component to mainFrame
            mainFrame.add(driverRecord, "driver record");
            // show new driverRecord component
            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "driver record");
        });

        driverRecord.getViewAddDriverButton().addActionListener(actionEvent -> {
            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "add form");
        });
    }
}
