package cz.ikis.ward;

import java.time.LocalDate;

public class Patient {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String diagnosis;
    private String currentWard;

    //Empty constructor
    public Patient(){}

    // Constructor for creating new patients - without id and current ward
    public Patient(String firstName, String lastName, LocalDate dateOfBirth, String diagnosis){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.diagnosis = diagnosis;
    }

    //Full constructor for fetching existing patients from the database
    public Patient(Long id, String firstName, String lastName, LocalDate dateOfBirth, String diagnosis, String currentWard) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.diagnosis = diagnosis;
        this.currentWard = currentWard;
    }

    //GETTERS
    public Long getId(){return id;};
    public String getFirstName(){return firstName;};
    public String getLastName(){return lastName;};
    public LocalDate getDateOfBirth(){return dateOfBirth;};
    public String getDiagnosis(){return diagnosis;};
    public String getCurrentWard(){return currentWard;};

    //SETTERS
    public void setId(Long id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    public void setDiagnosis(String diagnosis) {this.diagnosis = diagnosis;}
    public void setCurrentWard(String currentWard) {this.currentWard = currentWard;}
}
