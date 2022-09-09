package GuiClasses.School;

import javax.swing.*;
import java.awt.*;

public class schoolLogIn extends JFrame{
    private JPanel schoolLogInPanel;
    private JPanel schoolMessagePanel;
    private JPanel schoolInputPanel;
    private JTextField schoolIdTf;
    private JPasswordField schoolPf;
    private JButton schoolLoginBtn;
    private JButton schoolCancelBtn;
    private JPanel footerPanel;
    private JLabel schoolLbl;
    private JLabel logInLbl;
    private JLabel schoolIcon;
    private JLabel schoolFooterLbl;
    private JLabel schoolIdLbl;
    private JLabel schoolPassLbl;

    public schoolLogIn(JFrame parent) {
        super();
        setTitle("School Login");
        setContentPane(schoolLogInPanel);
        setMinimumSize(new Dimension(450,450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        schoolLogIn dl = new schoolLogIn(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
