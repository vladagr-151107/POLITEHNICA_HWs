package Lab10;

public class Fish extends Animal{
    public Fish(){
        super(0);
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    @Override
    public void play(){
        System.out.println("Fish eats sea plants");
    }
}
