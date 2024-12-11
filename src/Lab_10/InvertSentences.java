package Lab_10;
import java.io.*;
public class InvertSentences {
    public static void reverseLines(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); //buffers the input to make a faster reading of the file
             PrintWriter writer = new PrintWriter(new File(outputFile))){ // write info to the new file

            String[] lines = new String[100];
            int count = 0;

            String line;
            while ((line = reader.readLine()) != null && count < lines.length) {
                lines[count++] = line;
            }

            for (int i = count - 1; i >= 0; i--) {
                writer.println(lines[i]);
            }

            System.out.println("Lines reversed and written to " + outputFile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        String inputFile = "C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab_10\\test.txt";
        String outputFile = "C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab_10\\reverse.txt";
        reverseLines(inputFile, outputFile);
    }
}
