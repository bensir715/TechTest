package controller;

import model.Driver;
import model.DriverTableModel;
import model.DummyDb;
import util.Util;
import view.AddDriverForm;
import view.DriverRecord;
import view.MainFrame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneralController {
    private DummyDb dataBase;

    private MainFrame mainFrame;
    private AddDriverForm addDriverForm;
    private DriverRecord driverRecord;

    public GeneralController(MainFrame mainFrame, AddDriverForm addDriverForm, DriverRecord driverRecord) {
        this.dataBase = new DummyDb();

        this.mainFrame = mainFrame;
        this.addDriverForm = addDriverForm;
        this.driverRecord = driverRecord;

        addDriverForm.getAddButton().addActionListener(actionEvent -> {

            Driver driver = mapAddFormToObj(addDriverForm);

            if(driver == null) {
                return;
            }
            // add Driver to dummy DB
            dataBase.getDriverList().add(driver);

            // load driverList from dummy DB to driverRecord
            loadDriver(driverRecord, dataBase.getDriverList());

            // Renew driverRecord component to mainFrame
            mainFrame.add(driverRecord, "driver record");
            // show new driverRecord component
            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "driver record");

            resetAddFormField(addDriverForm);/**/
        });

        addDriverForm.getDriverViewButton().addActionListener(actionEvent ->{
            // load driverList from dummy DB to driverRecord
            loadDriver(driverRecord, dataBase.getDriverList());
            // Renew driverRecord component to mainFrame
            driverRecord.getDriverTable().revalidate();

            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "driver record");
        });

        driverRecord.getViewAddDriverButton().addActionListener(actionEvent -> {
            mainFrame.getCardLayout().show(mainFrame.getContentPane(), "add form");
        });

        driverRecord.getDeleteDriverButton().addActionListener(actionEvent -> {
            int rowIndex = driverRecord.getDriverTable().getSelectedRow();
            if(rowIndex == -1){
                JOptionPane.showMessageDialog(null,"Please selected one driver profile record.");
            } else {
                int input = JOptionPane.showConfirmDialog(null,
                        "Are you sure to delete the selected driver profile?", "Confirmation",
                        JOptionPane.OK_CANCEL_OPTION);
                if(input == 0){
                    // remove from table
                    DriverTableModel model = (DriverTableModel) driverRecord.getDriverTable().getModel();
                    model.removeRow(rowIndex);
                    driverRecord.getDriverTable().revalidate();

                    // save action to dummyDB
                    dataBase.getDriverList().remove(rowIndex);
                }
            }
        });
    }

    private void resetAddFormField(AddDriverForm form){
        form.setNameField("");
        form.setSurnameField("");
        form.setEmailField("");
        form.setVehicleTypeField("");
        form.setBaseFarePriceField(0);
        form.setBaseFareDistanceField(0);
    }

    private void loadDriver(DriverRecord driverRecord, List<Driver> driverList){
        DriverTableModel model = new DriverTableModel(new ArrayList<Driver>());
        for(Driver driver : driverList){
            model.addRow(driver);
        }
        driverRecord.getDriverTable().setModel(model);
    }

    private Driver mapAddFormToObj(AddDriverForm addDriverForm){
        // retrieve info from addDriverForm
        String name = addDriverForm.getName();
        String surname = addDriverForm.getSurname();
        String email = addDriverForm.getEmail();
        String vehicleType = addDriverForm.getVehicleType();;
        Integer baseFarePrice = addDriverForm.getBaseFarePrice();
        Integer baseFareDistance = addDriverForm.getBaseFareDistance();

        if(checkDriverValid(name, surname, email, vehicleType, baseFarePrice, baseFareDistance)) {
            return new Driver(name, surname, email, vehicleType, baseFarePrice, baseFareDistance);
        }
        return null;
    }

    private boolean checkDriverValid(String name, String surname, String email, String vehicleType, Integer baseFarePrice, Integer baseFareDistance){
        if(name == null){
            JOptionPane.showMessageDialog(null,"Name cannot be empty.");
            return false;
        } else if(surname == null){
            JOptionPane.showMessageDialog(null,"Surname cannot be empty.");
            return false;
        } else if(!Util.validateEmail(email)){
            JOptionPane.showMessageDialog(null,"Invalid email.");
            return false;
        } else if(baseFarePrice < 0){
            JOptionPane.showMessageDialog(null,"Base Fare Price cannot be negative");
            return false;
        } else if(baseFareDistance < 0){
            JOptionPane.showMessageDialog(null,"Base Fare Distance cannot be negative");
            return false;
        }
        return true;
    }
}
