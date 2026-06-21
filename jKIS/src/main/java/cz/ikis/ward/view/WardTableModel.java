package cz.ikis.ward.view;

import cz.ikis.ward.model.Patient;

import javax.swing.table.AbstractTableModel;
import java.util.*;
import java.util.stream.Collectors;

public class WardTableModel extends AbstractTableModel {

    private final List<String> wardNames;
    private final Map<String, String> wardPatients;
    private final String[] columns = {"Ward", "Patients"};

    public WardTableModel(List<Patient> patients) {
        // Group patients by ward, joining their names into a comma-separated string
        wardPatients = patients.stream()
                .collect(Collectors.groupingBy(
                        Patient::getCurrentWard,
                        TreeMap::new,
                        Collectors.mapping(
                                p -> p.getFirstName() + " " + p.getLastName(),
                                Collectors.joining(", ")
                        )
                ));

        wardNames = new ArrayList<>(wardPatients.keySet());
    }

    @Override
    public int getRowCount() { return wardNames.size(); }

    @Override
    public int getColumnCount() { return columns.length; }

    @Override
    public String getColumnName(int column) { return columns[column]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String ward = wardNames.get(rowIndex);
        switch (columnIndex) {
            case 0: return ward;
            case 1: return wardPatients.get(ward);
            default: return null;
        }
    }
}
