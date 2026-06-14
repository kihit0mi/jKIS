package cz.ikis.ward;

import cz.ikis.ward.controller.NavigationController;
import cz.ikis.ward.model.PatientService;
import cz.ikis.ward.view.MainDashboard;
import cz.ikis.ward.view.SidebarPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            System.out.println("iKIS is loading up.");

            PatientService patientService = new PatientService();

            SidebarPanel sidebar = new SidebarPanel();
            MainDashboard mainUI = new MainDashboard(sidebar);

            NavigationController controller = new NavigationController(sidebar, mainUI, patientService);
            mainUI.setVisible(true);
        });
    }
}
