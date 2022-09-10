package GuiClasses.Trainer;

import javax.swing.*;
import java.awt.*;

public class trainerMainFrame extends JFrame{
    private JPanel traMainPnl;
    private JTabbedPane traTab;
    private JPanel traSubmitGradePnl;
    private JPanel traLogoutPnl;
    private JButton submitButton;
    private JButton clearButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel traRosterPnl;
    private JButton confirmChangesButton;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;

    public trainerMainFrame(JFrame parent) {
        super();
        setTitle("Trainer Main Frame");
        setContentPane(traMainPnl);
        setMinimumSize(new Dimension(711,640));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        trainerMainFrame tmf = new trainerMainFrame(null);
    }

}
