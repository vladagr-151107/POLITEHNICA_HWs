package BonusTask;

public class Hospital {
    private String name;
    private String address;
    private String phoneNumber;
    Department [] departments;
    public Hospital(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Hospital(String name) {
        this.name = name;
    }
}
