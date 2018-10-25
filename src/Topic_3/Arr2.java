package Topic_3;

public class Arr2 {
    public static void main(String[] args) {

        //Task 15, page 35............................................................................

        int numbers[] = {5, 9, 6, 2, 9, 3, 4, 0, 8, 2, 1, 7};
        int maxN, minN, maxI, minI, sum;
        sum = 0;
        maxN = numbers[0];
        minN = numbers[0];
        minI = 0;
        maxI = 0;
        //Находим максимальное и минимальное значение и их индексы
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxN) {
                maxN = numbers[i];
                maxI = i;
            }
            if (numbers[i] < minN) {
                minN = numbers[i];
                minI = i;
            }
        }
        //Находим сумму в зависимости от того, максимальное или минимальное значение встретилось первым
        if (maxI > minI) {
            for (int i = (minI + 1); i < maxI; i++) {
                sum = sum + numbers[i];
            }
        } else {
            for (int i = (maxI + 1); i < minI; i++) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("sum=" + sum);

    }
}

