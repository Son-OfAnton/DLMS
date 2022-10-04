package GuiClasses.Driver;

import CoreClasses.Driver;
import javax.swing.*;
import java.awt.*;

import static GuiClasses.Driver.PersonalInfo.personalInfoFun;

public class DriverMainFrame extends JFrame {
    JTabbedPane driTab;
    JPanel driMainPnl;
    JPanel driPersonalInfoPnl;
    JButton driSaveBtn;
    JTextField driOldPassTf;
    JTextField driNewPassTf;
    JTextField driConfirmPassTf;
    JPanel driGradePnl;
    JPanel driMedicalPnl;
    JPanel driChangePassPnl;
    JPanel driLogoutPnl;
    JLabel driIdLbl;
    JLabel driNameLbl;
    JLabel driSexLbl;
    JLabel driPhoneLbl;
    JLabel driEmailLbl;
    JLabel driAddressLbl;

    public DriverMainFrame(JFrame parent) {
        super();
        setTitle("Driver Main Frame");
        setContentPane(driMainPnl);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void boot(Driver dri) {
        DriverMainFrame dmf = new DriverMainFrame(null);
        personalInfoFun(dmf, dri);
    }

    public static void main(String[] args) {

    }
}
