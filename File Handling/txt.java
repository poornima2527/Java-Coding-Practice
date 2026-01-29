import java.io.*;
import java.FileReader;
import java.io.IOException;
public class txt {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
         catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}