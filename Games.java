import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        // Необходимый инструментал
        Random random = new Random(); // рандомайзер чисел
        Scanner scan = new Scanner(System.in); // ввод игрока
        System.out.println("Попробуй найти сокровище, у тебя всего 5 попыток");
        boolean exit = false; // повторение игры

        // ЗАПУСК ЦИКЛА
        while (!exit) { // реализуем повторение игры
            char[] field = {'_', '_', '_', '_', '_', '_', '_'}; // ввели массив
            int x = random.nextInt(field.length); // задали для секрета рандомное значение в пределах массива

            boolean won = false; // булевой флаг - для выйгрыша

            // Запускаем цикл подсчета попыток
            for (int i = 5; i > 0; i--) { // пока не закончаться попытки - играем

                // Вывод поля в консоль
                for (int j = 0; j < field.length; j++) { // выводим в консоль индексы для упрощения взаимодействия
                    System.out.print(j + " ");
                }
                System.out.println(); // перенос на след. строку
                for (char ch : field) { // перебор массив и вывод в консоль
                    System.out.print(ch + " ");
                }

                // Выбор игроком участка поля
                System.out.println("\nВыберите участок, который будете копать: ");
                System.out.println("У вас осталось попыток: " + i); // счетчик попыток
                int choice = scan.nextInt(); // выбор игрока

                // Исключение выпадания за поле
                if (choice > field.length - 1 || choice < 0) { // если количество попыток больше или отричательно чем длинна массива - ошибка
                    System.out.println("Ваше число вышло за границы поля");
                    i++; // не считаем за ошибку
                    continue; // запускаем цикл заново
                }

                // Попадание в одно и тоже поле
                if (field[choice] != '_') { // проверка чтобы избежать попадания на одни и те же грабли
                    System.out.println("Здесь уже копали!");
                    i++;
                    continue; // возврат на старт цикла
                }

                // Выйгрыш
                if (choice == x) { // если значения равны
                    System.out.println("\nВы нашли сокровище");
                    field[choice] = 'X'; // заменяем в массиве символ на Х

                    for (int j = 0; j < field.length; j++) { // выводим в консоль
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    for (char ch : field) {
                        System.out.print(ch + " ");
                    }

                    System.out.println();

                    won = true; // если мы нашли сокровище - ставим в булевой флаг true
                    break; // и выходим из цикла, чтобы дальше не заменять на ?
                }

                // Ненаход
                field[choice] = '?'; // если не тот нашли то ставим ?

                if (choice < x) { // ставим подсказки для поиска сокровища
                    System.out.println("Ваше сокровище где-то правее");
                } else System.out.println("Ваше сокровище где-то левее");
            }

            // Проигрыш
            if (!won) { // если не выйграли и попытки закончились по булевому флагу
                System.out.println("Ваши попытки закончились");

                field[x] = 'X'; // показываем где было спратано сокровище

                System.out.println("Сокровище было здесь: ");

                for (int j = 0; j < field.length; j++) { // выводим в консоль
                    System.out.print(j + " ");
                }
                System.out.println();
                for (char ch : field) {
                    System.out.print(ch + " ");
                }

                System.out.println(); // пустая строка
            }

            // Повторение игры
            System.out.print("\nСыграть ещё раз? (да/нет): "); // повторение игры
            String answer = scan.next();

            if (answer.equalsIgnoreCase("нет")) {
                exit = true;
                System.out.println("До свидания!");
            }
        }
        scan.close();
    }
}