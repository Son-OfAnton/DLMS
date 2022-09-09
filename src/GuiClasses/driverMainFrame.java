package GuiClasses;

import javax.swing.*;
import java.awt.*;

public class driverMainFrame extends JFrame{
    private JPanel driverMainPanel;
    private JPanel driverMainButtonsPanel;
    private JPanel driverMainParentPanel;
    private JButton driverPersonalInfoBtn;
    private JButton driverGradeBtn;
    private JButton driverMedicalBtn;
    private JButton driverChangePassBtn;
    private JButton driverLogOutBtn;

    public driverMainFrame(JFrame parent) {
        super();
        setTitle("Driver Main Frame");
        setContentPane(driverMainPanel);
        setMinimumSize(new Dimension(547,500));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        driverMainFrame dmf = new driverMainFrame(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
