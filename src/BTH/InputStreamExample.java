package BTH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
            InputStream is  = new FileInputStream("demo.txt");
            int i = -1;
            while ((i = is.read()) != -1) {
                System.out.println((char) i);
            }
            is.close();

    }
}
