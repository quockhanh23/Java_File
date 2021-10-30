import java.io.*;
import java.util.Scanner;

public class T {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/demo.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("1");
        bufferedWriter.write("\n2");
        bufferedWriter.write("\n3");
//        Scanner scanner = new Scanner(System.in);
//        bufferedWriter.write(scanner.nextLine());
        bufferedWriter.close();

        FileReader fileReader = new FileReader("src/demo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        int sum = 0;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

            sum += Integer.parseInt(line);
            bufferedWriter.close();
        }
        System.out.println("Tổng = " + sum);

        }
    }

