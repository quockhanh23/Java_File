package THDocVaGhi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "khánh", "1"));
        students.add(new Student(2, "khánh", "2"));
        students.add(new Student(3, "khánh", "3"));
        students.add(new Student(4, "khánh", "4"));
        writeToFile("src/THDocVaGhi/student.txt", students);
        List<Student> studentList = readDataFromFile("src/THDocVaGhi/student.txt");
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
