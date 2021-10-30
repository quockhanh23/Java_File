package TH;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("nam", 20);
        File file = new File("Object.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if (!file.exists()) {

                if (file.createNewFile()) {
                    oos.writeObject(person);
                    System.out.println("KKK");
                }
            } else {
                System.out.println("file đã tồn tại");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
