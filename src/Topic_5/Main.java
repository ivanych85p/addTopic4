package Topic_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Task 26, page 68..............................................................................................


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
    }
}

