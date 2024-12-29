package BonusTask;

import java.util.Calendar;
public class Staff extends Person{
    private String certification;
    public Staff(String givenName, Calendar birthday, String certification) {
        super(givenName, birthday);
        this.certification = this.certification;
    }
}
