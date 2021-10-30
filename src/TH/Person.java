package TH;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
