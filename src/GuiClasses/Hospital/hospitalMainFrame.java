package GuiClasses.Hospital;

import javax.swing.*;
import java.awt.*;

public class hospitalMainFrame extends JFrame {
    private JPanel hosMainPnl;
    private JTabbedPane hosTab;
    private JButton submitButton;
    private JButton clearButton;
    private JTextField examineDriHosIdTf;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton passedRadioButton;
    private JRadioButton failedRadioButton;

    public hospitalMainFrame(JFrame parent) {
        super();
        setTitle("Hospital Main Frame");
        setContentPane(hosMainPnl);
        setMinimumSize(new Dimension(500,500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {hospitalMainFrame hmf = new hospitalMainFrame(null);
    }

}
