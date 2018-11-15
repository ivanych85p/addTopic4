package Topic_4;

public class Main {
    public static void main(String[] args) {
        //Task 22, page 49.............................................................................................

        //Создаем 2 объекта при помощи разных конструкторов
        Interval interval1 = new Interval(3, 17, 24);
        Interval interval2 = new Interval(3600);

        //Выводим общее количество секунд
        interval1.getFullSec();
        interval2.getFullSec();

        //Выводим часы, минуты и секунды по отдельности
        interval1.fullTime();
        interval2.fullTime();

        //Сравниваем два интервала
        int result = interval1.compareToInterval(interval2);
        System.out.println(result);
        System.out.println();

        //Task 23, page 49.............................................................................................
        Atm atm = new Atm(2,1,1);
        atm.addMoney(3,1,1);
        atm.getMoney(290);
        atm.getMoney(50);
        atm.getMoney(110);


    }
}
