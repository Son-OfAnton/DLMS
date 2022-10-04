package GuiClasses.Hospital;

import CoreClasses.Hospital;

import javax.swing.*;
import java.awt.*;

public class HospitalMainFrame extends JFrame {
    private JPanel hosMainPnl;
    private JTabbedPane hosTab;
    private JButton submitBtn;
    private JButton clearBtn;
    private JTextField examineDriHosIdTf;
    private JTextField examineDriDriIdTf;
    private JTextField examineDriDateTf;
    private JTextField examineDriBloodTf;
    private JRadioButton passedRadioBtn;
    private JRadioButton failedRadioBtn;
    private JPanel hosExamineDriPnl;
    private JPanel hosDriExamInfoPnl;
    private JPanel hosLogoutPnl;

    public HospitalMainFrame(JFrame parent) {
        super();
        setTitle("Hospital Main Frame");
        setContentPane(hosMainPnl);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void boot(Hospital hosp) {
    }

    public static void main(String[] args) {

    }


}
