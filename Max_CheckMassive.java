public class Max_CheckMassive {
    public static void main(String[] args) {
        int [] numbers = {1, 5, 8, 9}; // создаем массив
        int max = numbers[0]; // Ставим в максимальное число первый элемент массива как стартовый
        int min = numbers[0]; // Ставим в минимальное число первый элемент массива как стартовый
        int maxIndex = 0; // создаем поиск по индексу и прописываем ноль в него как первый индекс
        int minIndex = 0; // создаем поиск по индексу и прописываем ноль в него как первый индекс
        int index = 0; // создаем счетчик индекса
        for (int num : numbers) { // перебор массива
            if (num > max) { // проверяем какой элемент массива больше
                max = num;
                maxIndex = index;
            }

            if (num < min) { // проверяем какой элемент массива меньше
                min = num;
                minIndex = index;
            }

            index++; // считаем индекс после сравнения, т.к. перед даст первый индекс (1), хотя он (0)
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("maxIndex: " + maxIndex);
        System.out.println("minIndex: " + minIndex);
    }
}
