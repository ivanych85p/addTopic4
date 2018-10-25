package Student;

public class Addition {
    public static void main (String [] args){
        //Task 2.3..................................................................................................

        int chas_prihoda, minuta_prihoda, chas_ekz, minuta_ekz, chas_raznica, minuta_raznica;
        chas_ekz = 9;
        minuta_ekz =30;
        chas_prihoda = 9;
        minuta_prihoda = 15;
        // определяем, на сколько часов студент опоздал или пришел заранее
        chas_raznica = chas_prihoda - chas_ekz;
        // определяем, на сколько минут студент опоздал или пришел заранее, или пришел вовремя
        minuta_raznica = minuta_prihoda - minuta_ekz;
        // высчитываем интервал для случая, когда час прихода студента больше часа экзамена
        if (chas_prihoda > chas_ekz)
            if (minuta_prihoda < minuta_ekz)
            {minuta_raznica = minuta_raznica + 60;
                chas_raznica = chas_raznica - 1;};
        // высчитываем интервал для случая, когда час прихода менее часа экзамена
        if (chas_prihoda < chas_ekz)
            if (minuta_prihoda > minuta_ekz)
            {minuta_raznica = - (minuta_raznica - 60);
                chas_raznica = chas_raznica + 1;}
            else {chas_raznica = - chas_raznica;
                minuta_raznica = - minuta_raznica;}
        // высчитываем интервал для случая, когда час прихода равен часу экзамена
        if (chas_prihoda == chas_ekz)
            if (minuta_prihoda < minuta_ekz)
                minuta_raznica = - minuta_raznica;
        System.out.println("Время экзамена " + chas_ekz + " ч " + minuta_ekz + " мин");
        System.out.println("Студент пришел в " + chas_prihoda + " ч " + minuta_prihoda + " мин");
        // начинаем проверять различные условия прихода студента на экзамен и выдаем результат
        if (chas_prihoda > chas_ekz)
            System.out.println("Он опоздал на " + chas_raznica + " ч " + minuta_raznica + " мин");
        if (chas_prihoda == chas_ekz)
            if (minuta_prihoda > minuta_ekz)
                System.out.println("Он опоздал на " + chas_raznica + " ч " + minuta_raznica + " мин");
            else
            if (minuta_raznica > 30)
                System.out.println("Он пришел раньше на " + chas_raznica + " ч " + minuta_raznica + " мин");
            else  System.out.println("Он пришел вовремя, за " + minuta_raznica + " мин до экзамена");
        if (chas_prihoda < chas_ekz)
            if (chas_raznica >= 1)
                System.out.println("Он пришел раньше на " + chas_raznica + " ч " + minuta_raznica + " мин");
            else
            if (minuta_raznica > 30)
                System.out.println("Он пришел раньше на " + chas_raznica + " ч " + minuta_raznica + " мин");
            else System.out.println("Он пришел вовремя, за " + minuta_raznica + " мин до экзамена");
        System.out.println();


        //Task 4.1...................................................................................................
        System.out.println("Сортировка четных по возрастанию");
        int[] sortChoiseIn = {6, 2, 4, 1, 2, 6, 8, 4, 9, 2, 3};
        for (int i1 = 0; i1 < sortChoiseIn.length; i1++) {
            System.out.print(sortChoiseIn[i1] + " ");
        }
        System.out.println();
        for (int i1 = 0; i1 < sortChoiseIn.length; i1 += 2) {
            int minIndex = i1;
            for (int j1 = i1 + 2; j1 < sortChoiseIn.length; j1 += 2) {
                if (sortChoiseIn[j1] < sortChoiseIn[minIndex]) {
                    minIndex = j1;
                }
            }
            int temp = sortChoiseIn[i1];
            sortChoiseIn[i1] = sortChoiseIn[minIndex];
            sortChoiseIn[minIndex] = temp;
        }
        for (int i1 = 0; i1 < sortChoiseIn.length; i1++) {
            System.out.print(sortChoiseIn[i1] + " ");
        }
        System.out.println();
        System.out.println("Сортировка четных по убыванию");

        int[] sortChoiseDec = {6, 2, 4, 1, 2, 6, 8, 4, 9, 2, 3};
        for (int i1 = 0; i1 < sortChoiseDec.length; i1++) {
            System.out.print(sortChoiseDec[i1] + " ");
        }
        System.out.println();
        for (int i1 = 0; i1 < sortChoiseDec.length; i1 += 2) {
            int maxIndex = i1;
            for (int j1 = i1 + 2; j1 < sortChoiseDec.length; j1 += 2) {
                if (sortChoiseDec[j1] > sortChoiseDec[maxIndex]) {
                    maxIndex = j1;
                }
            }
            int temp = sortChoiseDec[i1];
            sortChoiseDec[i1] = sortChoiseDec[maxIndex];
            sortChoiseDec[maxIndex] = temp;
        }
        for (int i1 = 0; i1 < sortChoiseDec.length; i1++) {
            System.out.print(sortChoiseDec[i1] + " ");
        }
        System.out.println();
        System.out.println();


        //Task 4.2.............................................................................................
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int x;
        x = array[0];
        for (int i = 0; i < array.length; i++){
            if (x < array [i]){
                x = array[i];
            }
        }
        System.out.print(x);
        System.out.println();


        //Task 4.3............................................................................................
        int x1, s;
        x1 = 45843;
        s = 0;
        while (x1 != 0){
            s += x1 % 10;
            x1 = x1/10;}
        System.out.println("sum=" + s);
        System.out.println();
        

        //Task 4.4..............................................................................................
        int x2, s2;
        x2 = 6;
        s2 = 0;
        while (x2 != 1){
            x2 = x2 - 1;
            s2 = s2 + x2;
        }
        System.out.println("s2=" + s2);
        System.out.println();


        //Task 4.5................................................................................................
        int x3;
        long p;
        x3 = 7;
        p = 1L;
        while (x3 != 1){
            x3 = x3 - 1;
            p = p * x3;
        }
        System.out.println("p=" + p);


    }
}

