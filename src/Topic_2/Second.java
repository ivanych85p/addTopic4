package Topic_2;

import jdk.nashorn.internal.objects.NativeInt16Array;

public class Second {
    public static void main(String[] args) {

        //Task 3, page 19..........................................................

        int x, y;
        x = 434257128;
        y = x % 10;
        if (y == 7)
            System.out.println("последняя цифра 7");
        else
            System.out.println("последняя цифра не является семеркой");
        System.out.println();


        //Task 4, page 19..........................................................

        double a, b, r, c;
        a = 4;
        b = 3;
        r = 2.5;
        c = Math.sqrt(a * a + b * b);
        c = c / 2;
        if (r >= c)
            System.out.println("можно закрыть отверстие");
        else
            System.out.println("нельзя закрыть отверстие");
        System.out.println();



        //Task 5, page 22...........................................................

        int R, rr;
        R = 200000178;
        rr = R % 10;

        if (((R > 4) && (R < 21)) || (rr > 4) || (rr == 0)) {
            System.out.println(R + " рублей");
        } else if ((rr > 1) && (rr < 5)) {
            System.out.println(R + " рубля");
        } else
            System.out.println(R + " рубль");
        System.out.println();




        //Task 6, page 23...............................................................

        int Day, DayNext, Month, Year;
        boolean yearLeap;
        Day = 29;
        Month = 2;
        Year = 1600;
        DayNext = Day + 1;

        //Проверяем, является ли год високосным

        if ((Year % 400) == 0) {
            yearLeap = true;
        } else if ((Year % 4) == 0 && (Year % 100) != 0) {
            yearLeap = true;
        } else yearLeap = false;

        //Проверяем корректность ввода текущей даты, т.е. есть ли данный день в текущем месяце

        if (((!yearLeap) && (Month == 2) && (Day > 28)) || (((Month == 4) || (Month == 6) || (Month == 9) || (Month == 11)) && (Day > 30))) {
            System.out.println("No this date in this year");
        } else {
            //если дата корректная, выводим её и начинаем высчитывать дату завтрашнего дня
            System.out.println("Date today: " + Day + " " + Month + " " + Year);

            //Проверяем месяцы, в которых 30 дней
            if ((Month == 4) || (Month == 6) || (Month == 9) || (Month == 11)) {
                if (DayNext > 30) {
                    DayNext = 1;
                    Month++;
                }
                //Проверяем декабрь
            } else if (Month == 12) {
                if (DayNext > 31) {
                    DayNext = 1;
                    Month = 1;
                    Year++;
                }
                //Проверяем февраль
            } else if (Month == 2) {
                if (yearLeap) {
                    if (DayNext > 29) {
                        DayNext = 1;
                        Month = 3;
                    }
                } else if (DayNext > 28) {
                    DayNext = 1;
                    Month = 3;
                }
                //Проверяем месяцы, в которых 31 день
            } else if (DayNext > 31) {
                DayNext = 1;
                Month++;
            }
            System.out.println("Date tomorrow: " + DayNext + " " + Month + " " + Year);
        }
        System.out.println();


        //Task 7, page 23.....................................................................................

        int a1, b1, c2, d2, e, f, ac, ad, bc, bd;
        //Размеры 1-го дома
        a1 = 2;
        b1 = 3;
        //Размеры 2-го дома
        c2 = 2;
        d2 = 2;
        //Размеры участка
        e = 4;
        f = 4;
        //Вводим вспомогательные переменные
        ac = a1 + c2;
        ad = a1 + d2;
        bc = b1 + c2;
        bd = b1 + d2;
        //Проверяем разные варианты

        if ((ac <= e) && (b1 <= f) && (d2 <= f)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((ac <= f) && (b1 <= e) && (d2 <= e)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((ad <= e) && (b1 <= f) && (c2 <= f)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((ad <= f) && (b1 <= e) && (c2 <= e)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((bc <= e) && (a1 <= f) && (d2 <= f)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((bc <= f) && (a1 <= e) && (d2 <= e)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((bd <= e) && (a1 <= f) && (c2 <= f)){
            System.out.println("Можно разместить дома на участке");
        }
        else if ((bd <= f) && (a1 <= e) && (c2 <= e)){
            System.out.println("Можно разместить дома на участке");
        }
        else
            System.out.println("Нельзя разместить дома на участке");
        System.out.println();


        //Task 8, page 26.......................................................................

        //Что делать, если значение выходит за пределы типа Long?

        long F = 1;
        int i = 1;
        while (i <= 25){
            F = F * i;
            i++;
        }
        System.out.println("F= " + F);
        System.out.println();


        //Task 9, page 27..........................................................................

        //находим максимальное значение среди случайных чисел (пока не встретится 0)
        int maxN, n, s;
        s = (int)(Math.random()*20);
        maxN = s;
        while (s != 0){
            s = (int)(Math.random()*20);
            System.out.println(s);
            if (s > maxN){
                maxN = s;
                }
        }
        System.out.println("Maximum number is " + maxN);
        System.out.println();


        //Task 10, page 27...........................................................................

        int v, sum;
        sum = 0;
        v = 456879;
        while (v != 0){
            sum += (v % 10);
            v = v / 10;
         }
        System.out.println("sum = " + sum);
        System.out.println();


        //Task 11, page 28..............................................................................

        int k, N, j;
        N = 121;
        j = 0;
        //осуществляем перебор делителей
        for (k = 2; (k * k) <= N; k++){
            if (j == 0){
                if ((N % k) == 0){
                    j++;
                }
            }
        }

        if (j > 0){
            System.out.println("not simple number");
        }
        else
            System.out.println("simple number");
        System.out.println();


        //Task 12, page 29........................................................................

        Long W, Y;
        String t;
        W = 111222333444555666L;
        t = "";
        while (W != 0){
            Y = W % 1000;
            W /= 1000;
            t = " " + Y + t;
            }
        System.out.println(t);
        System.out.println();


        //Task 13, page 30...............................................................

        int k1, N1, j1;
        N1 = 37;
        j1 = 0;
        //осуществляем перебор делителей
        for (k1 = 2; (k1 * k1) <= N1; k1++){
           if ((N1 % k1) == 0){
                    j1++;
                    break;
                }
            }
        if (j1 > 0){
            System.out.println("not simple number");
        }
        else
            System.out.println("simple number");
        System.out.println();












    }

}
