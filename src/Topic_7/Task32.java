package Topic_7;

import java.io.*;

public class Task32 {
    public static void main(String[] args) throws IOException {
        //Записываем числа в двоичный файл
        System.out.println("Task 32, page 79");
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\Java\\number2.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("not found");
            return;
        }
        int a;
        for (int i = 0; i < 20; i++) {
            a = (int) (Math.random() * 10 + 1);
            System.out.print(a + " ");
            try {
                dataOutputStream.writeInt(a);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        //Считываем двоичный файл

        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\Java\\number2.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("not found");
            return;
        }
        int result = dataInputStream.readInt();
        while (true) {
            System.out.print(result + " ");
            try {
                result = dataInputStream.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

