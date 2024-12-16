package HW11;

abstract class Rock implements Tossable{
    @Override
    public void toss(){
        System.out.println("We toss the rock.");
    }
}
