import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checkedException {
    public static void main(String[] args) {
        try(            BufferedReader fr = new BufferedReader(new FileReader("data.txt"));
        ) {
            String data;
            while ((data = fr.readLine())!= null) {
                System.out.println(data);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File Not Found!!");
        }        
    }
}
