package HW5_right;
//this code prints an array and then addresses the function test that changes the first element of array to 0
public class Two {
    public static void main(String[] args){
        int[] v = {1,2,3,4};
        printArray(v);
        test(v);
        printArray(v);
    }
    static void test(int[] s){
        s[0] = 0;
    }
    static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
