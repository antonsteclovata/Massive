import java.util.Arrays;

public class ThirdMax_CheckMassive {
    // Поиск трех максимальных чисел
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 4, 7, 5, 7}; // вводим массив
        int max1 = Integer.MIN_VALUE; // ставим в них минимальное значение
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;


        for (int num : numbers) { // запускаем перебор массива
            if (num == max1 || num == max2 || num == max3) { // запускаем проверку на одинаковые числа || - или
                continue; // пропускаем их
            }
            if (num > max1) { // проверяем 1 раз
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) { // проверяем 2 раз
                max3 = max2;
                max2 = num;
            } else if (num > max3) { // проверяем 3 раз
                max3 = num;
            }
        }
        System.out.println(max3);
        System.out.println(max2);
        System.out.println(max1);

        // Самый простой способ
        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length - 1]);
        System.out.println(numbers[numbers.length - 2]);
        System.out.println(numbers[numbers.length - 3]);
    }
}

