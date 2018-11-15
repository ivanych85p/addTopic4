package Topic_4;

public class Interval {

    //Task 22, page 49.............................................................................................

    //Свойства каласса: часы, минуты, секунды
    private int hours;
    private int minutes;
    private int sec;

    //Конструктор, получающий часы, минуты, секунды
    public Interval(int hours, int minutes, int sec) {
        this.hours = hours;
        this.minutes = minutes;
        this.sec = sec;
    }

    //Конструктор, получающий только секунды
    public Interval (int s){
        int m, h;
        sec = s % 60;
        m = (s - sec) / 60;
        minutes = m % 60;
        h = (m - minutes) / 60;
        hours = h % 24;
    }

    //Метод для вывода часов, минут и секунд по отдельности
    void fullTime() {
        System.out.println("Now: " + hours + " hours " + minutes + " min " + sec + " seconds");
    }

    //Метод для получения полного количества секунд
    int fullSec() {
        int fullsec = hours * 3600 + minutes * 60 + sec;
        return fullsec;
    }

    //Метод для вывода полного количества секунд
    void getFullSec() {
        int fc = fullSec();
        System.out.println("Total number of seconds: " + fc);
    }

    //Метод для сравнения двух временных интервалов
    int compareToInterval(Interval p2) {
        int t1 = this.fullSec();
        int t2 = p2.fullSec();
        int delta = t1 - t2;
        return delta;
    }
}




