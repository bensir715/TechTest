package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddDriverForm extends JPanel {
    JButton addButton;
    JButton driverViewButton;
    JButton fareViewButton;

    JLabel nameLabel;
    JLabel surnameLabel;
    JLabel emailLabel;
    JLabel vehicleTypeLabel;
    JLabel baseFarePriceLabel;
    JLabel baseFareDistanceLabel;

    JTextField nameField;
    JTextField surnameField;
    JTextField emailField;
    JTextField vehicleTypeField;
    JTextField baseFarePriceField;
    JTextField baseFareDistanceField;


    public AddDriverForm() {
        // add label test
        this.nameLabel = new JLabel("Name: ");
        this.surnameLabel = new JLabel("Surname: ");
        this.emailLabel = new JLabel("Email: ");
        this.vehicleTypeLabel = new JLabel("Vehicle Type: ");
        this.baseFarePriceLabel = new JLabel("Base Fare Price: ");
        this.baseFareDistanceLabel = new JLabel("Base Fare Distance: ");

        // add input text field
        this.nameField = new JTextField(15);
        this.surnameField = new JTextField(15);
        this.emailField = new JTextField(15);
        this.vehicleTypeField = new JTextField(15);
        this.baseFarePriceField = new JTextField(15);
        this.baseFareDistanceField = new JTextField(15);

        // add button text
        Dimension buttonSize = new Dimension(150, 20);
        this.addButton = new JButton("Add");
        this.addButton.setPreferredSize(buttonSize);
        this.driverViewButton = new JButton("View Driver Profiles");
        this.driverViewButton.setPreferredSize(buttonSize);
        this.fareViewButton = new JButton("View Fare Record");
        this.fareViewButton.setPreferredSize(buttonSize);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(nameLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(nameField, constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        add(surnameLabel, constraints);
        constraints.gridx = 3;
        constraints.gridy = 0;
        add(surnameField, constraints);
        constraints.gridx = 4;
        constraints.gridy = 0;
        add(emailLabel, constraints);
        constraints.gridx = 5;
        constraints.gridy = 0;
        add(emailField, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(vehicleTypeLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(vehicleTypeField, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        add(baseFarePriceLabel, constraints);
        constraints.gridx = 3;
        constraints.gridy = 1;
        add(baseFarePriceField, constraints);
        constraints.gridx = 4;
        constraints.gridy = 1;
        add(baseFareDistanceLabel, constraints);
        constraints.gridx = 5;
        constraints.gridy = 1;
        add(baseFareDistanceField, constraints);
        Insets buttonInsets = new Insets(5, 0, 0, 0);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.insets = buttonInsets;
        constraints.anchor = GridBagConstraints.CENTER;
        add(addButton, constraints);
        constraints.gridx = 3;
        constraints.gridy = 2;
        add(driverViewButton, constraints);
        constraints.gridx = 4;
        constraints.gridy = 2;
        add(fareViewButton, constraints);
    }

    // getter
    public String getName(){
        return this.nameField.getText();
    }

    public String getSurname(){
        return this.surnameField.getText();
    }

    public String getEmail(){
        return this.emailField.getText();
    }

    public String getVehicleType(){
        return this.vehicleTypeField.getText();
    }

    public Integer getBaseFarePrice(){
        return Integer.valueOf(this.baseFarePriceField.getText());
    }

    public Integer getBaseFareDistance(){
        return Integer.valueOf(this.baseFareDistanceField.getText());
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getDriverViewButton() {
        return driverViewButton;
    }

    public JButton getFareViewButton() {
        return fareViewButton;
    }
}
