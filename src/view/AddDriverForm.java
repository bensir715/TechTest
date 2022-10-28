package view;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AddDriverForm extends JPanel {
    private JButton addButton;
    private JButton driverViewButton;
    private JButton fareViewButton;

    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel emailLabel;
    private JLabel vehicleTypeLabel;
    private JLabel baseFarePriceLabel;
    private JLabel baseFareDistanceLabel;

    private JTextField nameField;
    private JTextField surnameField;
    private JTextField emailField;
    private JTextField vehicleTypeField;
    private JFormattedTextField baseFarePriceField;
    private JFormattedTextField baseFareDistanceField;


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
        // add formatter to allow only numbers
        DecimalFormat df = new DecimalFormat();
        NumberFormatter numberFormatter = new NumberFormatter(df);
        numberFormatter.setMinimum(0);
        DefaultFormatterFactory factory = new DefaultFormatterFactory(numberFormatter);
        this.baseFarePriceField = new JFormattedTextField(factory, 0);
        this.baseFareDistanceField = new JFormattedTextField(factory, 0);
        this.baseFarePriceField.setColumns(15);
        this.baseFareDistanceField.setColumns(15);

        // add button text
        Dimension buttonSize = new Dimension(150, 20);
        this.addButton = new JButton("Register");
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

    // setter
    public void setNameField(String nameField) {
        this.nameField.setText(nameField);
    }

    public void setSurnameField(String surnameField) {
        this.surnameField.setText(surnameField);
    }

    public void setEmailField(String emailField) {
        this.emailField.setText(emailField);
    }

    public void setVehicleTypeField(String vehicleTypeField) {
        this.vehicleTypeField.setText(vehicleTypeField);
    }

    public void setBaseFarePriceField(Integer baseFarePriceField) {
        this.baseFarePriceField.setValue(baseFarePriceField);
    }

    public void setBaseFareDistanceField(Integer baseFareDistanceField) {
        this.baseFareDistanceField.setValue(baseFareDistanceField);
    }
}
