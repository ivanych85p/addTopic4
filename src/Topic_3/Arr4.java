package Topic_3;

import java.util.regex.Matcher;

public class Arr4 {
    public static void main(String[] args) {
        //Task 17, page 36.............................................................................

        int butterfly[][] = new int[5][5];
        int k, m;
        k = butterfly.length;
        m = 0;
        for (int i = 0; i < butterfly.length; i++) {

            for (int j = 0; j < butterfly[i].length; j++) {
                if (((j >= i) && (j < k)) || ((j >= (k - 1)) && (j <= i))) {
                    butterfly[i][j] = 1;
                } else butterfly[i][j] = 0;
            }
            k--;
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        //Task 18, page 42................................................................................

        String s = "Перед( нашими) \"глазами\" - тестовая, строка! с? различными: знаками; препинания.";
        int n = 0;
        char symbol;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            if ((symbol == '.') || (symbol == ',') || (symbol == '!') || (symbol == '?') || (symbol == ':') ||
                    (symbol == ';') || (symbol == '-') || (symbol == '(') || (symbol == ')') || (symbol == '"')) {
                n++;

            }
        }
        System.out.println("В тексте " + n + " знаков препинания");
        System.out.println();


        //Task 19, page 43..............................................................................................

        String st2 = " Тестовая строка  - строка  с различным  количеством пробелов ";
        int numberOfWords1;
        st2 = st2.trim();
        String[] words = st2.split("[^а-яА-Я]+");
        numberOfWords1 = words.length;
        System.out.println("numberOfWords1 = " + numberOfWords1);
        System.out.println();


        //Task 20, page 43..................................................................................

        String s2 = "Перед нашими глазами тестовая строка";
        //выводим последние буквы всех слов, кроме последнего
        for (int i = 0; i < s2.length() - 1; i++){
            if ((s2.charAt(i) != ' ') && (s2.charAt(i + 1) == ' ')){
                System.out.print(s2.charAt(i));
            }
        }
        //выводим последнюю букву последнего слова
        System.out.print(s2.charAt(s2.length() - 1));
        System.out.println();


        //Tak 21, page 44.....................................................................................

        String s3 = "";
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 255; i++){
            s3 += (char) i;
        }
        long endTime1 = System.nanoTime();
        long delta1 = (endTime1 - startTime1);
        StringBuilder s4 = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 255; i++){
            s4 = s4.append((char) i);
        }
        long endTime2 = System.nanoTime();
        long delta2 = (endTime2 - startTime2);
        System.out.println("Сложение строк с помощью String занимает " + delta1 + " наносекунд");
        System.out.println("Сложение строк с помощью StringBuilder занимает " + delta2 + " наносекунд");


    }

}

