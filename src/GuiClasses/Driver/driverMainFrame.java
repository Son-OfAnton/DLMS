package GuiClasses.Driver;

import CoreClasses.Driver;
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
    private JLabel driIdLbl;
    private JLabel driNameLbl;
    private JLabel driSexLbl;
    private JLabel driPhoneLbl;
    private JLabel driEmailLbl;
    private JLabel driAddressLbl;

    public driverMainFrame(JFrame parent) {
        super();
        setTitle("Driver Main Frame");
        setContentPane(driMainPnl);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void boot(Driver dri) {
//        driverMainFrame dmf = new driverMainFrame(null);
        driIdLbl.setText(String.valueOf(dri.getId()));
        driNameLbl.setText(dri.getfName() + " " + dri.getlName());
        driSexLbl.setText(dri.getSex());
        driPhoneLbl.setText(dri.getPhone());
        driEmailLbl.setText(dri.getEmail());
        driAddressLbl.setText(dri.getAddress());
    }

    public static void main(String[] args) {

    }
}
