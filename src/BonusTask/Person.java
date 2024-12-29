package BonusTask;
import java.util.Calendar;

public class Person{
    protected String givenName;
    protected Calendar birthday;
    public Person(String givenName, Calendar birthday) {
        this.givenName = givenName;
        this.birthday = birthday;
    }
}
