package BTQLNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "khánh1", "lolo", 10));
        products.add(new Product(2, "khánh2", "lolo", 10));
        products.add(new Product(3, "khánh3", "lolo", 10));
        products.add(new Product(4, "khánh4", "lolo", 10));
        writeToFile("src/BTQLNhiPhan/quanly.txt", products);
        List<Product> products1 = readDataFromFile("src/BTQLNhiPhan/quanly.txt");
        for (Product p : products1) {
            System.out.println(p);
        }

    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

}
