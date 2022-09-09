package GuiClasses.Trainer;

import javax.swing.*;
import java.awt.*;

public class trainerLogIn extends JFrame {
    private JPanel trainerLogInPanel;
    private JPanel trainerMessagePanel;
    private JPanel trainerInputPanel;
    private JLabel trainerLbl;
    private JLabel trainerIcon;
    private JTextField trainerIdTf;
    private JPasswordField trainerPassTf;
    private JButton trainerLogInBtn;
    private JButton trainerCancelBtn;
    private JLabel trainerIDLbl;
    private JLabel trainerPassLbl;
    private JPanel trainerFooterPanel;

    public trainerLogIn(JFrame parent) {
        super();
        setTitle("Trainer Login");
        setContentPane(trainerLogInPanel);
        setMinimumSize(new Dimension(450,450));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        trainerLogIn tl = new trainerLogIn(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
