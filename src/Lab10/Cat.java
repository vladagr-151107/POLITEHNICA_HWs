package Lab10;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this(" ");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String setName(String name){
        this.name = name;
        return name;
    }
    @Override
    public void play(){
        System.out.println("Cat plays with toys.");
    }
    @Override
    public void eat(){
        System.out.println("Cat eat food specified for them");
    }
}
