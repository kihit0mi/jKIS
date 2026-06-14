package cz.ikis.ward;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    public List<Patient> getMockPatients(){
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient(1L, "Edmond", "Dantes", LocalDate.of(1984, 3, 15), "Migraine", "Neurology"));
        patients.add(new Patient(1L, "Mercedes", "Herrera", LocalDate.of(1985, 6, 22), "Arrhytmia", "Cardiology"));
        patients.add(new Patient(1L, "Fernard", "Mondego", LocalDate.of(1982, 11, 8), "Fractured Femur", "Orthopedics"));
        patients.add(new Patient(1L, "Gerard", "de Villefort", LocalDate.of(1972, 2, 2), "Hypertension", "Cardiology"));
        patients.add(new Patient(1L, "Albert", "de Morcerf", LocalDate.of(2005, 9, 14), "Diabetes", "Internal Medicine"));
        patients.add(new Patient(1L, "Maximillien", "Morrel", LocalDate.of(1996, 4, 30), "Migraine", "Neurology"));

        return patients;
    }
}
