package Topic_7;

import java.io.File;

public class Task33 {
    public static void main(String[] args) {
        File directory = new File("D:\\Java\\");
        int count1 = 0;
        int count2 = 0;
        System.out.println("Directories:");
        if (directory.isDirectory()) {
            for (File names : directory.listFiles()) {
                if (names.isDirectory()) {
                    count1++;
                    System.out.println(names.toString().replaceAll("D:\\\\Java\\\\", ""));
                }
            }
            if (count1 == 0){
                System.out.println("0 directories");
            }
            System.out.println();
            System.out.println("Files:");
            for (File names : directory.listFiles()) {
                if (names.isFile()) {
                    count2++;
                    System.out.println(names.toString().replaceAll("D:\\\\Java\\\\", ""));
                }
            }
            if (count2 == 0){
                System.out.println("0 files");
            }
        }
    }
}
