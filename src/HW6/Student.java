package HW6;

public class Student {
    private String name;
    private int points;
    private int exams;
    public Student(String name, int points){
        this.name = name;
        this.points = points;
        this.exams = 0;
    }
    public String getName(){
        return name;
    }
    public void addExam(int mark){
        points += mark;
        exams++;
    }
    public int getTotal(){
        return points;
    }
    public double getMeanMark(){
        if(exams == 0){
            return 0;
        }
        return (double) Math.round(points/exams);
    }
}
