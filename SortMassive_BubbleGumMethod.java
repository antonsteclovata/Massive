public class SortMassive_BubbleGumMethod {
    // сортировка пузырьком
    public static void main(String[] args) {
        int numbers [] = {1, 5, 3, 7, 8, 6, 2}; // заводим массив

        for (int i = 0; i < numbers.length; i++) { // запускает проверку столько раз сколько значений в цикле
            for (int j = 0; j < numbers.length - 1; j++) { // переменная j ставит позицию где начинать проводить проверку (-1 т к иначе будет сравнивать последнее значение с ничем)
                if (numbers[j] > numbers[j + 1]) { // берем два значения и сравниваем их j и j + 1
                    int temp = numbers[j]; // сохраняем левый элемент
                    numbers[j] = numbers[j + 1]; // на место левого ставим правый
                    numbers[j + 1] = temp; // на место правого ставим левый
                }
            }
        }
        // если два значения стоят не правильно, данный код ставит их в нужном порядке и запускает много проверок, согласно числу значений в массиве
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
