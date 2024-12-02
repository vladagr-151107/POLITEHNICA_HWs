package Lab8;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String displayPerson(){
        return firstName + ", " + lastName + ", " + age;
    }
    public String getLast(){
        return lastName;
    }
}
