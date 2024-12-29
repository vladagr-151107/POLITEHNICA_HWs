package BonusTask;

import java.util.Calendar;

public class Patient extends Person{
    private String sicknessHistory;
    private String prescription;

    public Patient(String givenName, Calendar birthday) {
        super(givenName, birthday);
        this.prescription = prescription;
        this.sicknessHistory = sicknessHistory;
    }
}
