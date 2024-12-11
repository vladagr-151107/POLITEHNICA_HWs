package Lab10;

abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.printf("The animal walks with %s", legs);
    }
}
