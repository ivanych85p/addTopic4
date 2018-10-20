package Theme1;

public class First {
    public static void main (String[] args){
        //Task 1, page 5
        System.out.println("Hello World!");

        //Task 2, page 17
        int s = 1299600;
        int sec, m, min, h, hours, d, days, weeks;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = (h - hours) / 24;
        days = d % 7;
        weeks = (d - days) / 7;

        System.out.println(weeks + " нед " + days + " дн " + hours + " ч " + min + " мин " + sec + " сек");
    }
}
