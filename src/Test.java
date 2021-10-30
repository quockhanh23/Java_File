import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir2 = new File("gago/gogo/ggg/gg/gg/gg/gg/gg/gg");
        boolean check = dir2.mkdirs();
        System.out.println(check);
        File file = new File("gago/gogo/ggg/khanh.txt");

        try {
            boolean check2 = file.createNewFile();
            System.out.println(check2);
            System.out.println("Path is Folder: " + file.isDirectory());
            System.out.println("Hiden: " + file.isHidden());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());

        }catch (Exception e) {
            System.out.println("ngoại lệ");
        }


    }
}
