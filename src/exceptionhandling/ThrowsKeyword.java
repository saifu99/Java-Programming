package exceptionhandling;
import java.io.IOException;

public class ThrowsKeyword {
    static void readFile() throws IOException {
        throw new IOException("file not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}
