package HW5_right;
//i hope i understood the assignment in a right way, we use contains and replace so we could swap the text we had with the text we need
public class One {
    public static void main(String[] args){
        String s = "I am working on HW 5 at the moment";
        System.out.println(s);
        if(s.contains("am")){
            s = s.replace(" am", "a m");
            System.out.println(s);
        }
    }
}
