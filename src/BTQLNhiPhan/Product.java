package BTQLNhiPhan;

import java.io.PrintStream;
import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String made;
    private int price;

    public Product(int id, String name, String made, int price) {
        this.id = id;
        this.name = name;
        this.made = made;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", made='" + made + '\'' +
                ", price=" + price +
                '}';
    }
}
