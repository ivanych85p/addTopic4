package Topic_3;

public class Arr3 {
    public static void main (String [] args){

      //Task 16, page 35..................................................................

      int m [] = new int[10];
      int temp;
      //Заполняем массив случайными элементами
      for (int i = 0; i < m.length; i++){
         m [i] = (int) (Math.random() * 10);
          System.out.print(m [i] + " ");
              }
        System.out.println();
      //Присваиваем поочередно временной переменной значения массива, начиная с конца

       for (int i = 0; i < m.length; i++){
           temp = m [m.length - 1 - i];
           System.out.print(temp + " ");
       }
      }
      }


