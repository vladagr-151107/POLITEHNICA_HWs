package Lab4;
import java.util.Arrays;

public class One {
    public static void main(String[] args){
    int[] A = {1, 5, 9, 17};
    int[] B = {2, 18, 23, 35, 49, 73};
    int[] C = new int[A.length + B.length];
    int i = 0; int j = 0; int k =0;
    while (i < A.length && j < B.length) {
        C[k++] = (A[i] < B[j]) ? A[i++] : B[j++];
    }
        while (i < A.length) C[k++] = A[i++];
        while (j < B.length) C[k++] = B[j++];
        System.out.print(Arrays.toString(C));
}
}
