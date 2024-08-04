import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Expense calculator");
        Connection connection = null;
        Font fontDesign = new Font("Arial" , Font.PLAIN , 20);

        JLabel expenseTitleLabel = new JLabel("Expenses");
        expenseTitleLabel.setFont(fontDesign);
        expenseTitleLabel.setForeground(Color.RED);
        expenseTitleLabel.setBounds(225,20,100,30);
        frame.add(expenseTitleLabel);

        JLabel expense_type = new JLabel("Expense Type");
        expense_type.setFont(fontDesign);
        expense_type.setBounds(20 , 60 ,130, 30);
        frame.add(expense_type);

        JLabel expenseAmountLabel = new JLabel("Expense Amount");
        expenseAmountLabel.setFont(fontDesign);
        expenseAmountLabel.setBounds(20 , 90 , 150,30);
        frame.add(expenseAmountLabel);

        JTextField expenseTypeInput = new JTextField();
        expenseTypeInput.setBounds(180 , 60,130,30);
        frame.add(expenseTypeInput);

        JTextField expenseAmountInput = new JTextField();
        expenseAmountInput.setBounds(180 , 90,130,30);
        frame.add(expenseAmountInput);

        JLabel incomeTitleLabel = new JLabel("Income");
        incomeTitleLabel.setFont(fontDesign);
        incomeTitleLabel.setForeground(Color.GREEN);
        incomeTitleLabel.setBounds(225 ,120 , 300 , 30);
        frame.add(incomeTitleLabel);

        JLabel addIncomeLabel = new JLabel("Add Income");
        addIncomeLabel.setFont(fontDesign);
        addIncomeLabel.setBounds(20, 150, 130, 30);
        frame.add(addIncomeLabel);

        JTextField addIncomeInput = new JTextField();
        addIncomeInput.setBounds(180 ,150 ,130, 30);
        frame.add(addIncomeInput);

        JButton addIncomeBtn = new JButton("Save");
        addIncomeBtn.setBounds(100 , 200 , 100 , 30);
        addIncomeBtn.setBackground(Color.GREEN);
        addIncomeBtn.setFont(fontDesign);
        frame.add(addIncomeBtn);

        //database config
        String url = "jdbc:mysql://localhost:3306/expensecalculator";
        String userName = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url , userName ,password);
            System.out.println("DB is connected");

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        Connection conn = connection;
        addIncomeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expenseType = expenseTypeInput.getText();
                int expenseAmount = expenseAmountInput.getText().isEmpty() ? 0 : Integer.parseInt(expenseAmountInput.getText());
                //validation of empty form
                if (!(expenseAmount <= 0) && !expenseType.isEmpty()){
                    //insert Data
                    String insertData = "INSERT INTO expensesTB (expenseType ,expenseAmount , incomeAmount) VALUES (? , ? , ?)";

                    try {
                        PreparedStatement statement = conn.prepareStatement(insertData);
                        statement.setString(1,expenseType);
                        statement.setInt(2,expenseAmount);
                        statement.setInt(3,Integer.parseInt(addIncomeInput.getText()));
                        statement.execute();

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }else {
                    JOptionPane.showMessageDialog(null , "Please enter valid data");


                }

            }
        });

        JButton viewIncomeBtn = new JButton("View");
        viewIncomeBtn.setBounds(300 , 200 , 100 , 30);
        viewIncomeBtn.setBackground(Color.GREEN);
        viewIncomeBtn.setFont(fontDesign);
        frame.add(viewIncomeBtn);
        frame.setSize(500 ,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}