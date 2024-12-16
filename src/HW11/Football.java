package HW11;

public class Football extends Ball{
    public Football(String brandName){
        super(brandName);
    }
    @Override
    public void toss(){
        System.out.println(getBrandName() + "We toss the ball.");
    }
    @Override
    public void bounce(){
        System.out.println(getBrandName() +"We bounce the ball.");
    }
}
