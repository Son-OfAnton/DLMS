package GuiClasses.School;

import javax.swing.*;
import java.awt.*;

public class schoolMainFrame extends JFrame {
    private JPanel schMainPnl;
    private JTabbedPane schTab;
    private JPanel schRegisterDriPnl;
    private JPanel schDriInfoPnl;
    private JPanel schDriGradePnl;
    private JPanel schChangeDriInfoPnl;
    private JPanel schChangePassPnl;
    private JPanel schLogoutPnl;
    private JTextField registerDriLNameTf;
    private JTextField registerDriBirthTf;
    private JTextField registerDriPhoneTf;
    private JTextField registerDriEmailTf;
    private JTextField registerDriAddressTf;
    private JTextField registerDriPassTf;
    private JButton registerDriBtn;
    private JButton registerDriClearBtn;
    private JRadioButton registerDriMaleBtn;
    private JRadioButton registerDriFemaleBtn;
    private JTextField registerDriIdTf;
    private JTextField registerDriFNameTf;
    private JButton confirmChangesButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JButton searchButton;
    private JButton updateButton;
    private JButton clearButton;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField textField10;

    public schoolMainFrame(JFrame parent) {
        super();
        setTitle("School Main Frame");
        setContentPane(schMainPnl);
        setMinimumSize(new Dimension(711,640));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        schoolMainFrame smf = new schoolMainFrame(null);
    }

}
