package cz.ikis.ward.view;

import cz.ikis.ward.model.Patient;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PatientTableModel extends AbstractTableModel {

    private final List<Patient> patients;
    private final String[] columns = {"ID", "First Name", "Last Name", "DOB", "Diagnosis", "Ward"};

    // The table model requires the list of patients to do its job
    public PatientTableModel(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public int getRowCount() { return patients.size(); }

    @Override
    public int getColumnCount() { return columns.length; }

    @Override
    public String getColumnName(int column) { return columns[column]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // The JTable asks: "What data goes in Row 0, Column 4?"
        Patient patient = patients.get(rowIndex);

        switch (columnIndex) {
            case 0: return patient.getId();
            case 1: return patient.getFirstName();
            case 2: return patient.getLastName();
            case 3: return patient.getDateOfBirth();
            case 4: return patient.getDiagnosis();
            case 5: return patient.getCurrentWard();
            default: return null;
        }
    }
}