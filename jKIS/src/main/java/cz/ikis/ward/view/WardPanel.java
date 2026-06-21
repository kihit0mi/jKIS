package cz.ikis.ward.view;

import cz.ikis.ward.model.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class WardPanel extends JPanel {
    public WardPanel(List<Patient> patientData){

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Wards:");
        JPanel toolbar = new JPanel();

        StyledButton refreshBtn = StyledButton.toolbar("Refresh Data");
        StyledButton exportBtn = StyledButton.toolbar("Export Data");
        StyledButton detailBtn = StyledButton.toolbar("View Details");

        toolbar.add(refreshBtn);
        toolbar.add(exportBtn);
        toolbar.add(detailBtn);

        WardTableModel tableModel = new WardTableModel(patientData);
        JTable wardTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(wardTable);

        add(titleLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(toolbar, BorderLayout.SOUTH);
    }
}
