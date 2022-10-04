package GuiClasses.School;

import CoreClasses.School;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
//import static GuiClasses.School.registerDriver.registerDri;

public class SchoolMainFrame extends JFrame {
    JPanel schMainPnl;
    JTabbedPane schTab;
    JPanel schRegisterDriPnl;
    JPanel schDriInfoPnl;
    JPanel schDriGradePnl;
    JPanel schChangeDriInfoPnl;
    JPanel schChangePassPnl;
    JPanel schLogoutPnl;
    JTextField registerDriLNameTf;
    JTextField registerDriBirthTf;
    JTextField registerDriPhoneTf;
    JTextField registerDriEmailTf;
    JTextField registerDriAddressTf;
    JTextField registerDriPassTf;
    JButton registerDriBtn;
    JButton registerDriClearBtn;
    JRadioButton registerDriMaleRBtn;
    JRadioButton registerDriFemaleRBtn;
    JTextField registerDriIdTf;
    JTextField registerDriFNameTf;
    JButton confirmChangesButton;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField registerDriStartTf;
    JTextField changeInfoIdTf;
    JTextField changeInfoFNameTf;
    JTextField changeInfoLNameTf;
    JTextField changeInfoBirthTf;
    JTextField changeInfoPhoneTf;
    JTextField changeInfoEmailTf;
    JTextField changeInfoAddressTf;
    JTextField changeInfoStartTf;
    JTextField changeInfoEndTf;
    JTextField changeInfoPassTf;
    JButton searchButton;
    JButton updateButton;
    JButton clearButton;
    JRadioButton changeInfoMaleRBtn;
    JRadioButton changeInfoFemaleRBtn;
    JRadioButton registerDriMotorRBtn;
    JRadioButton registerDriPublicRBtn;
    JRadioButton registerDriLiquidRBtn;
    JRadioButton registerDriDryRBtn;
    JRadioButton changeInfoMotorRBtn;
    JRadioButton changeInfoLiquidRBtn;
    JRadioButton changeInfoPublicRBtn;
    JRadioButton changeInfoDryRBtn;

    public SchoolMainFrame(JFrame parent) {
        super();
        setTitle("School Main Frame");
        setContentPane(schMainPnl);
        setMinimumSize(new Dimension(711, 640));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        ButtonGroup registerSexGroup = new ButtonGroup();
        registerSexGroup.add(registerDriMaleRBtn);
        registerSexGroup.add(registerDriFemaleRBtn);

        ButtonGroup registerProgramGroup = new ButtonGroup();
        registerProgramGroup.add(registerDriMotorRBtn);
        registerProgramGroup.add(registerDriPublicRBtn);
        registerProgramGroup.add(registerDriLiquidRBtn);
        registerProgramGroup.add(registerDriDryRBtn);

        ButtonGroup changeInfoSexGroup = new ButtonGroup();
        changeInfoSexGroup.add(changeInfoMaleRBtn);
        changeInfoSexGroup.add(changeInfoFemaleRBtn);

        ButtonGroup changeInfoProgramGroup = new ButtonGroup();
        changeInfoProgramGroup.add(changeInfoMotorRBtn);
        changeInfoProgramGroup.add(changeInfoPublicRBtn);
        changeInfoProgramGroup.add(changeInfoLiquidRBtn);
        changeInfoProgramGroup.add(changeInfoDryRBtn);
    }
    public static void boot(School sch) {
        SchoolMainFrame smf = new SchoolMainFrame(null);

        smf.registerDriBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    registerDriver.registerDri(smf,sch);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static void main(String[] args) {

    }
}
