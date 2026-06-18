public class Theory {
    public static void main(String[] args) {

        // Инициализация массива
        int [] number  = {1, 5, 20, 45};
        String [] name = {"Anton", "Igor", "Alex", "Nastya"};

        // Вывод массива в консоль
        System.out.println(number[0]); // выйдет число 1
        System.out.println(name[2]); // выйдет имя Alex

        // Изменение элемента массива
        number[2] = 99; // теперь 20 это 99
        name[0] = "Antoha"; // так делать нельзя (строки не изменяются)

        // Перебор массива (тупой способ)
        int [] numbers = {1, 4, 6, 7, 4, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Перебор массива через for each
        int [] numbers2 = {1, 4, 6, 7, 4, 3};
        for (int num : numbers2) {
            System.out.println(num);
        }

        // Получение длинны строки (.length)
        String s = "Hello!";
        System.out.println(s.length()); // число будет равно 5

        // Получить символ из строки по индексу (charAt)
        String s2 = "hello";
        System.out.println(s2.charAt(2)); // получение буквы l

        // Вырезание части строки (substring)

        String s3 = "hello";
        System.out.println(s.substring(1,4)); // eni
        // Первый индекс УЧИТЫВАЕТСЯ, последний НЕ УЧИТЫВАЕТСЯ

        // String Builder
        StringBuilder hello = new StringBuilder("Hello"); // создаем StringBuilder
        hello.append(" world"); // добляем
        hello.append("!"); // добавляем
        System.out.println(hello.toString()); // переводим обратно в String

            // Основные методы String Builder
            hello.append("!!"); // добавляем элемент
            hello.insert(2, "EEE"); // добавить элемент после индекса
            hello.delete(2, 5); // удаление по индексу
    }
}
