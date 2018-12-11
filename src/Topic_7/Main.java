package Topic_7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    //Task 30, page 76...................................................................................................
    public static void main(String[] args) throws IOException {
        System.out.println("Task 30, page 76");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Welcome.txt"));
        StringBuilder stringBuilder = new StringBuilder();

        String text = bufferedReader.readLine();
        stringBuilder = stringBuilder.append(text);
        stringBuilder = stringBuilder.append(" ");
        while (text != null) {
            System.out.println(text);
            text = bufferedReader.readLine();
            if (text != null) {
                stringBuilder = stringBuilder.append(text);
                stringBuilder = stringBuilder.append(" ");
            }
        }
        System.out.println();
        //Находим количество слов
        String[] words = stringBuilder.toString().trim().split("[^a-zA-Z]+");
        int numberOfWords;
        numberOfWords = words.length;
        //Находим количество знаков препинания
        int lengthStart = stringBuilder.length();
        String s = stringBuilder.toString();
        int lengthEnd = lengthStart - s.replaceAll("[.,\\-:;?!]", "").length();


        System.out.println("numberOfWords = " + numberOfWords);
        System.out.println("numberOfPunctuationMarks = " + lengthEnd);
        System.out.println();
        bufferedReader.close();
    }
}
