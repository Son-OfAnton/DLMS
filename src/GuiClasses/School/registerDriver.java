package GuiClasses.School;

import CoreClasses.Driver;
import CoreClasses.School;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;

public class registerDriver {
    public static void registerDri(SchoolMainFrame smf, School sch) throws ParseException {
        String fName = smf.registerDriFNameTf.getText();
        String lName = smf.registerDriLNameTf.getText();
        String DOB = smf.registerDriBirthTf.getText();
        String phone = smf.registerDriPhoneTf.getText();
        String email = smf.registerDriEmailTf.getText();
        String address = smf.registerDriAddressTf.getText();
        String pass = smf.registerDriPassTf.getText();
        String start = smf.registerDriStartTf.getText();
        final String[] sex = new String[1];
        final String[] programType = new String[1];

        smf.registerDriMaleRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sex[0] = "M";
            }
        });
        smf.registerDriFemaleRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sex[0] = "F";
            }
        });

        smf.registerDriMotorRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                programType[0] = "Motor";
            }
        });
        smf.registerDriPublicRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                programType[0] = "Public";
            }
        });
        smf.registerDriLiquidRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                programType[0] = "Dry";
            }
        });
        smf.registerDriDryRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                programType[0] = "Liquid";
            }
        });

        if(fName.isEmpty() || lName.isEmpty() || DOB.isEmpty() || phone.isEmpty() || email.isEmpty()
                || address.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please fill important fields",
                    "Empty entry",
                    JOptionPane.ERROR_MESSAGE);

        }
        newDriver = addDriToDataBase(fName, lName, DOB, phone, email, address, pass, sex);

        if(newDriver != null) {
            System.out.println("Driver is successfully registered");
            System.out.println(newDriver.getId());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Failed to register driver",
                    "Failed",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Driver newDriver;
    private static Driver addDriToDataBase(String fName, String lName, String DOB,
                                           String phone, String email, String address,
                                           String pass, String[] sex) {

        Driver newDriver = null;
        final String dbUser = "admas";
        final String dbUrl = "jdbc:mysql://localhost:3306/DLMS";
        final String dbPass = "Pa$$w0rd121921";

        try {
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = connection.createStatement();
            String query = "INSERT INTO Driver(FName, LName, DOB, Sex, Phone, Email, Address, Pass) " +
                            "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, DOB);
            preparedStatement.setString(4, sex[0]);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, pass);

            int addedRows = preparedStatement.executeUpdate();
            if(addedRows > 0) {
                newDriver = new Driver();
                newDriver.setfName(fName);
                newDriver.setfName(lName);
                newDriver.setDOB(DOB);
                newDriver.setSex(String.valueOf(sex[0]));
                newDriver.setPhone(phone);
                newDriver.setEmail(email);
                newDriver.setAddress(address);
                newDriver.setPass(pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newDriver;
    }
}
