package THGhiDocFilenhiphan;

import java.io.*;

public class ObjectOutputStreamExample {

    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "khánh", 1);
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }

}
