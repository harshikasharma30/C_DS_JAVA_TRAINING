import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/railwaybookingdb";
        String userName = "root";
        String password = "";


        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connected to the database");

            JFrame frame = new JFrame("Railway Booking System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            JLabel personalLabel = new JLabel("Personal Details:");
            personalLabel.setBounds(10,10,120,30);
            frame.add(personalLabel);

            JLabel ticketLabel = new JLabel("Ticket Details:");
            ticketLabel.setBounds(310,10,120,30);
            frame.add(ticketLabel);

            JLabel userNameLabel = new JLabel("User Name:");
            userNameLabel.setBounds(10,50,120,30);
            frame.add(userNameLabel);

            JTextField userNameField = new JTextField();
            userNameField.setBounds(130,50,100,30);
            frame.add(userNameField);

            JLabel dateofjourneyLabel = new JLabel("Date of Journey:");
            dateofjourneyLabel.setBounds(310,50,120,30);
            frame.add(dateofjourneyLabel);

            JTextField dateofjourneyfield = new JTextField();
            dateofjourneyfield.setBounds(430,50,100,30);
            frame.add(dateofjourneyfield);

            JLabel ageLabel = new JLabel("Age:");
            ageLabel.setBounds(10,90,120,30);
            frame.add(ageLabel);

            JTextField agefield = new JTextField();
            agefield.setBounds(130,90,100,30);
            frame.add(agefield);

            JLabel sourceLabel = new JLabel("Source:");
            sourceLabel.setBounds(310,90,120,30);
            frame.add(sourceLabel);
            JTextField sourcefield = new JTextField();
            sourcefield.setBounds(430,90,100,30);
            frame.add(sourcefield);

            JLabel genderLabel = new JLabel("Gender:");
            genderLabel.setBounds(10,130,120,30);
            frame.add(genderLabel);

            JTextField genderfield = new JTextField();
            genderfield.setBounds(130,130,100,30);
            frame.add(genderfield);

            JLabel destinationLabel = new JLabel("Destination:");
            destinationLabel.setBounds(310,130,120,30);
            frame.add(destinationLabel);
            JTextField destinationfield = new JTextField();
            destinationfield.setBounds(430,130,100,30);
            frame.add(destinationfield);

            JLabel emailLabel = new JLabel("Email:");
            emailLabel.setBounds(10,170,120,30);
            frame.add(emailLabel);
            JTextField emailfield = new JTextField();
            emailfield.setBounds(130,170,100,30);
            frame.add(emailfield);

            JLabel ticketPriceLabel = new JLabel("Ticket Price:");
            ticketPriceLabel.setBounds(310,170,120,30);
            frame.add(ticketPriceLabel);
            JTextField ticketpricefield = new JTextField();
            ticketpricefield.setBounds(430,170,100,30);
            frame.add(ticketpricefield);

            JLabel mobileLabel = new JLabel("Mobile Number:");
            mobileLabel.setBounds(10,210,120,30);
            frame.add(mobileLabel);
            JTextField mobilefield = new JTextField();
            mobilefield.setBounds(130,210,100,30);
            frame.add(mobilefield);

            JLabel seatPreferenceLabel = new JLabel("Seat Preference:");
            seatPreferenceLabel.setBounds(310,210,120,30);
            frame.add(seatPreferenceLabel);
            JTextField seatPreferencefield = new JTextField();
            seatPreferencefield.setBounds(430,210,100,30);
            frame.add(seatPreferencefield);

            JLabel bookingIdLabel = new JLabel("Booking ID:");
            bookingIdLabel.setBounds(310, 250, 120, 30);
            frame.add(bookingIdLabel);

            JTextField bookingIdField = new JTextField();
            bookingIdField.setBounds(430, 250, 100, 30);
            frame.add(bookingIdField);


            JButton saveButton = new JButton("SAVE");
            saveButton.setBounds(70, 350, 100, 30);
            frame.add(saveButton);

            JButton updateButton = new JButton("UPDATE");
            updateButton.setBounds(240, 350, 100, 30);
            frame.add(updateButton);

            JButton deleteButton = new JButton("DELETE");
            deleteButton.setBounds(400, 350, 100, 30);
            frame.add(deleteButton);

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String insertQuery = "INSERT INTO ticketbookingtb(userName, age, gender, mobile, email, doj, source, destination, ticketPrice, seatPreference) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                        preparedStatement.setString(1, userNameField.getText());
                        preparedStatement.setInt(2, Integer.parseInt(agefield.getText()));
                        preparedStatement.setString(3, genderfield.getText());
                        preparedStatement.setString(4, mobilefield.getText());
                        preparedStatement.setString(5, emailfield.getText());
                        preparedStatement.setString(6, dateofjourneyfield.getText());
                        preparedStatement.setString(7, sourcefield.getText());
                        preparedStatement.setString(8, destinationfield.getText());
                        preparedStatement.setString(9, ticketpricefield.getText());
                        preparedStatement.setString(10, seatPreferencefield.getText());
                        preparedStatement.execute();
                        System.out.println("Ticket Booked Successfully");
                        userNameField.setText("") ;
                        agefield.setText("");
                        genderfield.setText("");
                        mobilefield.setText("");
                        emailfield.setText("");
                        dateofjourneyfield.setText("");
                        sourcefield.setText("");
                        destinationfield.setText("");
                        ticketpricefield.setText("");
                        seatPreferencefield.setText("");
                        bookingIdField.setText("");

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex) ;
                    }
                }
            });

            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String updateQuery = "UPDATE ticketbookingtb SET userName=?, age=?, gender=?, mobile=?, email=?, doj=?, source=?, destination=?, ticketPrice=?, seatPreference=? WHERE bookingId=?";
                        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
                        preparedStatement.setString(1, userNameField.getText());
                        preparedStatement.setInt(2, Integer.parseInt(agefield.getText()));
                        preparedStatement.setString(3, genderfield.getText());
                        preparedStatement.setString(4, mobilefield.getText());
                        preparedStatement.setString(5, emailfield.getText());
                        preparedStatement.setString(6, dateofjourneyfield.getText());
                        preparedStatement.setString(7, sourcefield.getText());
                        preparedStatement.setString(8, destinationfield.getText());
                        preparedStatement.setString(9, ticketpricefield.getText());
                        preparedStatement.setString(10, seatPreferencefield.getText());
                        preparedStatement.setInt(11, Integer.parseInt(bookingIdField.getText())); // Set the bookingId for the record to update
                        preparedStatement.execute();
                        System.out.println("Record Updated Successfully");
                        userNameField.setText("");
                        agefield.setText("");
                        genderfield.setText("");
                        mobilefield.setText("");
                        emailfield.setText("");
                        dateofjourneyfield.setText("");
                        sourcefield.setText("");
                        destinationfield.setText("");
                        ticketpricefield.setText("");
                        seatPreferencefield.setText("");
                        bookingIdField.setText("");

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex) ;
                    }
                }
            });

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String deleteQuery = "DELETE FROM ticketbookingtb WHERE bookingId=?";
                        PreparedStatement ps = connection.prepareStatement(deleteQuery);
                        ps.setInt(1,Integer.parseInt(bookingIdField.getText())); // Set the bookingId for the record to delete
                        ps.execute();
                        System.out.println("Booking Detail Deleted");
                        bookingIdField.setText("");

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);

                    }
                }
            });

            frame.setSize(600,600);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
