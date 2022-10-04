package GuiClasses.Driver;

import CoreClasses.Driver;

// a class which takes care of personalInfo panel of the driver main frame
public class PersonalInfo {
    public static void personalInfoFun(DriverMainFrame dmf, Driver dri) {
        dmf.driIdLbl.setText(String.valueOf(dri.getId()));
        dmf.driNameLbl.setText(dri.getfName() + " " + dri.getlName());
        dmf.driSexLbl.setText(dri.getSex());
        dmf.driPhoneLbl.setText(dri.getPhone());
        dmf.driEmailLbl.setText(dri.getEmail());
        dmf.driAddressLbl.setText(dri.getAddress());
    }
}
