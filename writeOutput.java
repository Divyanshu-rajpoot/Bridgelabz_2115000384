import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class writeOutput {
    public static void main(String[] args) {
        String filePath = "output.txt";  

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true)) {  

            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                userInput = bufferedReader.readLine();

                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                fileWriter.write(userInput + System.lineSeparator());
            }

            System.out.println("Input has been written to " + filePath);
        } catch (IOException e) {
            // Handle potential I/O exceptions (e.g., file writing errors)
            System.err.println("Error: " + e.getMessage());
        }
    }
}
