package cz.ikis.ward.controller;

import cz.ikis.ward.model.Patient;
import cz.ikis.ward.model.PatientService;
import cz.ikis.ward.view.MainDashboard;
import cz.ikis.ward.view.PatientListPanel;
import cz.ikis.ward.view.SidebarPanel;
import cz.ikis.ward.view.WardPanel;

import java.util.List;

public class NavigationController {

    private SidebarPanel sidebar;
    private MainDashboard dashboard;
    private PatientService patientService;
    public NavigationController(SidebarPanel sidebar, MainDashboard dashboard, PatientService patientService) {
        this.sidebar = sidebar;
        this.dashboard = dashboard;
        this.patientService = patientService;

        initListeners();
    }

    private void initListeners() {
        sidebar.addPatientsButtonListener(e -> {

            if(!dashboard.isTabOpen("All Patients")){

                List<Patient> mockData = patientService.getMockPatients();

                PatientListPanel patientList = new PatientListPanel(mockData);

                dashboard.openTabInWorkspace("All Patients", patientList);
            }
        });

        sidebar.addWardsButtonListener(e -> {

            if(!dashboard.isTabOpen("Wards")){

                List<Patient> mockData = patientService.getMockPatients();

                WardPanel wardPanel = new WardPanel(mockData);

                dashboard.openTabInWorkspace("Wards", wardPanel);
            }
        });
    }
}
