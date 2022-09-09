package GuiClasses.Driver;

import javax.swing.*;
import java.awt.*;

public class driverMainFrame extends JFrame {
    private JTabbedPane driTab;
    private JPanel driMainPnl;
    private JPanel driPersonalInfoPnl;
    private JButton driSaveBtn;
    private JTextField driOldPassTf;
    private JTextField driNewPassTf;
    private JTextField driConfirmPassTf;
    private JPanel driGradePnl;
    private JPanel driMedicalPnl;
    private JPanel driChangePassPnl;
    private JPanel driLogoutPnl;

    public driverMainFrame(JFrame parent) {
        super();
        setTitle("Driver Main Frame");
        setContentPane(driMainPnl);
        setMinimumSize(new Dimension(500,500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        driverMainFrame dmf = new driverMainFrame(null);
    }

}
