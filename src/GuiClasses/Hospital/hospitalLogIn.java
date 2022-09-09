package GuiClasses.Hospital;

import javax.swing.*;
import java.awt.*;

public class hospitalLogIn extends JFrame {
    private JPanel hospitalLogInPanel;
    private JPanel hospitalMessagePanel;
    private JPanel hospitalInputPanel;
    private JLabel hospitalLbl;
    private JLabel hospitalIcon;
    private JTextField hospitalIdTf;
    private JPasswordField hospitalPassTf;
    private JButton hospitalLogInBtn;
    private JButton hospitalCancelBtn;
    private JLabel hospitalIDLbl;
    private JLabel hospitalPassLbl;
    private JPanel hospitalFooterPanel;

    public hospitalLogIn(JFrame parent) {
        super();
        setTitle("hospital Login");
        setContentPane(hospitalLogInPanel);
        setMinimumSize(new Dimension(450,450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        hospitalLogIn hl = new hospitalLogIn(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
