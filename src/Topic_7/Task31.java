package Topic_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task31 {
    public static void main(String[] args) throws IOException {
        //Task 31, page 76..............................................................................................
        System.out.println("Task 31, page 76");
        FileInputStream fileInputStream = new FileInputStream("khl.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "Cp1251");
        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);

        StringBuilder sB = new StringBuilder();
        String information = bufferedReader2.readLine();
        sB = sB.append(information);
        sB = sB.append(" ");

        while (information != null) {
            System.out.println(information);
            information = bufferedReader2.readLine();
            if (information != null) {
                sB = sB.append(information);
                sB = sB.append(" ");
            }
        }
        String [] numbers = sB.toString().replaceAll("[^\\d]+", " ").trim().split(" ");
        int sum = 0;
        for (String n: numbers){
            System.out.print(n + " ");
            sum = sum + Integer.parseInt(n);
        }
        System.out.println();
        System.out.println("Сумма всех чисел = " + sum);

        List<String> list = Arrays.asList(numbers);
        ArrayList<String> arrayList = new ArrayList<String>(list);
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
        fileInputStream.close();
    }
}
