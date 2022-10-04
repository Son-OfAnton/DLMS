package GuiClasses.Trainer;

import CoreClasses.Trainer;
import javax.swing.*;
import java.awt.*;

public class TrainerMainFrame extends JFrame {
    private JPanel traMainPnl;
    private JTabbedPane traTab;
    private JPanel traSubmitGradePnl;
    private JPanel traLogoutPnl;
    private JButton submitButton;
    private JButton clearButton;
    private JTextField subGradeDriIdTf;
    private JTextField subGradeCourseIdTf;
    private JTextField subGradeGradeTf;
    private JTextField subGradeDateTf;
    private JPanel traRosterPnl;
    private JButton confirmChangesButton;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;

    public TrainerMainFrame(JFrame parent) {
        super();
        setTitle("Trainer Main Frame");
        setContentPane(traMainPnl);
        setMinimumSize(new Dimension(711, 640));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void boot(Trainer tra) {
        TrainerMainFrame tmf = new TrainerMainFrame(null);
    }

    public static void main(String[] args) {
        TrainerMainFrame tmf = new TrainerMainFrame(null);
    }
}
