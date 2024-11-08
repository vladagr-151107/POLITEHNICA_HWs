package HW6;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student("Vlada", 35);
        student.addExam(20);
        student.addExam(15);
        student.addExam(25);
        System.out.printf("Name: %s \n Total Points: %s\n Mean Mark: %s", student.getName(), student.getTotal(), student.getMeanMark());
    }
}
