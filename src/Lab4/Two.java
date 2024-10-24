package Lab4;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Two {
    public static void main(String[] args) {
        String sentence = "Store the tokens in an array of strings of characters.";
        StringTokenizer tokenizer = new StringTokenizer(sentence, " .");
        String[] token = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            token[index++] = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
        bubbleSort(token);
        System.out.println("Sorted tokens: ");
        for(String tokens: token) {
            System.out.println(Arrays.toString(token) + " ");
        }
    }
    public static void bubbleSort(String[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j].compareToIgnoreCase(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
