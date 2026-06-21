package cz.ikis.ward.view;

import cz.ikis.ward.model.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PatientListPanel extends JPanel {
    public PatientListPanel(List<Patient> patientData){

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Current Patients:");
        JPanel toolbar = new JPanel();

        StyledButton refreshBtn = StyledButton.toolbar("Refresh Data");
        StyledButton exportBtn = StyledButton.toolbar("Export Data");
        StyledButton detailBtn = StyledButton.toolbar("View Details");

        toolbar.add(refreshBtn);
        toolbar.add(exportBtn);
        toolbar.add(detailBtn);

        PatientTableModel tableModel = new PatientTableModel(patientData);
        JTable patientTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(patientTable);

        add(titleLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(toolbar, BorderLayout.SOUTH);
        };
    }
