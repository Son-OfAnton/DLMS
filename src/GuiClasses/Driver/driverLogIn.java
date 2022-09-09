package GuiClasses.Driver;

import javax.swing.*;
import java.awt.*;

public class driverLogIn extends JFrame{
    private JPanel driverLogInPanel;
    private JPanel driverMessagePanel;
    private JPanel driverInputPanel;
    private JTextField driverIdTf;
    private JPasswordField driverPf;
    private JButton driverLoginBtn;
    private JButton driverCancelBtn;
    private JPanel footerPanel;
    private JLabel driverLbl;
    private JLabel logInLbl;
    private JLabel driverIcon;
    private JLabel driverFooterLbl;
    private JLabel driverIdLbl;
    private JLabel driverPassLbl;

    public driverLogIn(JFrame parent) {
        super();
        setTitle("Diver Login");
        setContentPane(driverLogInPanel);
        setMinimumSize(new Dimension(450,450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        driverLogIn dl = new driverLogIn(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
