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

        ToolbarButton refreshBtn = new ToolbarButton("Refresh Data");
        ToolbarButton exportBtn = new ToolbarButton("Export Data");
        ToolbarButton detailBtn = new ToolbarButton("View Details");

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
