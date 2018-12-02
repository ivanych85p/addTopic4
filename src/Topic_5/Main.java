package Topic_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 26, page 68..............................................................................................
        System.out.println("Task 26");

        ArrayList<Integer> marks = new ArrayList<Integer>();
        int pupils = 10;
        int goodMark = 4;
        for (int i = 0; i < pupils; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(marks);
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < goodMark) {
                marks.remove(i);
                i--;
            }
        }
        System.out.print(marks);
        System.out.println();
        System.out.println();


        //Task 27, page 68..............................................................................................
        System.out.println("Task 27");

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        int n = 15;
        for (int i = 0; i < n; i++) {
            randomNumbers.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(randomNumbers);
        HashSet hashSet = new HashSet();
        hashSet.addAll(randomNumbers);
        randomNumbers.clear();
        randomNumbers.addAll(hashSet);
        System.out.println(randomNumbers);
        System.out.println();


        //Task 28, page 71..............................................................................................
        System.out.println("Task 28");

        ArrayList<Integer> marksOfPupils = new ArrayList<>();
        int numberOfPupils = 15;
        for (int i = 0; i < numberOfPupils; i++) {
            marksOfPupils.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(marksOfPupils);
        int maxMark = 0;
        ListIterator<Integer> listIterator = marksOfPupils.listIterator();
        while (listIterator.hasNext()) {

            if (listIterator.next() > maxMark) {
                maxMark = listIterator.previous();
            }
        }
        System.out.println("maxMark = " + maxMark);
        System.out.println();


        //Task 29, page 71.............................................................................................
        System.out.println("Task 29");

        String text = "Посадил дед репку и говорит:\n" +
                "— Расти, расти, репка, сладка! Расти, расти, репка, крепка!\n" +
                "Выросла репка сладка, крепка, большая-пребольшая.\n" +
                "Пошел дед репку рвать: тянет-потянет, вытянуть не может.\n" +
                "Позвал дед бабку.\n" +
                "\n" +
                "Бабка за дедку,\n" +
                "Дедка за репку —\n" +
                "\n" +
                "Тянут-потянут, вытянуть не могут.\n" +
                "Позвала бабка внучку.\n" +
                "\n" +
                "Внучка за бабку,\n" +
                "Бабка за дедку,\n" +
                "Дедка за репку —\n" +
                "\n" +
                "Тянут-потянут, вытянуть не могут.\n" +
                "Позвала внучка Жучку.\n" +
                "\n" +
                "Жучка за внучку,\n" +
                "Внучка за бабку,\n" +
                "Бабка за дедку,\n" +
                "Дедка за репку —\n" +
                "\n" +
                "Тянут-потянут, вытянуть не могут.\n" +
                "Позвала Жучка кошку.\n" +
                "\n" +
                "Кошка за Жучку,\n" +
                "Жучка за внучку,\n" +
                "Внучка за бабку,\n" +
                "Бабка за дедку,\n" +
                "Дедка за репку —\n" +
                "\n" +
                "Тянут-потянут, вытянуть не могут.\n" +
                "Позвала кошка мышку.\n" +
                "\n" +
                "Мышка за кошку,\n" +
                "Кошка за Жучку,\n" +
                "Жучка за внучку,\n" +
                "Внучка за бабку,\n" +
                "Бабка за дедку,\n" +
                "Дедка за репку —\n" +
                "\n" +
                "Тянут-потянут — и вытянули репку. Вот и сказке Репка конец, а кто слушал - молодец!\n";
        text = text.toLowerCase();
        String[] wordsOfText = text.split("[^а-яА-Я]+");
        TreeMap<String, Integer> numbersOfWords = new TreeMap<>();
        for (String word : wordsOfText) {
            if (!numbersOfWords.containsKey(word)) {
                numbersOfWords.put(word, 0);
            }
            numbersOfWords.put(word, numbersOfWords.get(word) + 1);
        }
        for (String word : numbersOfWords.keySet()) {
            System.out.println(word + " " + numbersOfWords.get(word));
        }
    }
}

