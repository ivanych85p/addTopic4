package Topic_3;

public class Arr1 {
    public static void main (String[] args){
        //Task 14, page 35..........................................................................

        int marks [] = new int [15];
        int mM;
        mM = marks [0];
        //Заполняем массив
        for (int i=0; i < marks.length; i++){
            marks [i] = (int) (Math.random() * 10 + 1);
            System.out.println(marks [i]);
            }
        System.out.println();
        //Находим максимальную оценку
        for (int i = 0; i < marks.length; i++) {
            if (mM < marks [i]) {
                mM = marks[i];
            }
        }
        //Сравниваем оценки учеников с максимальной и, в случае равенства, выводим  номер ученика
        for (int i = 0; i < marks.length; i++) {
            if (marks [i] == mM) {
                System.out.println("Pupil №" + i + " has the highest mark");

            }
        }


        }
    }

