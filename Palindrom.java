public class Palindrom {
    // найти слово палиндром (зеркальное слово типа level - задом наперед читается также)
    public static void main(String[] args) {
        String word = "level";
        int left = 0; // левая буква по индексу ноль
        int right = word.length() - 1; // правая 4 как и индексс
        while (left < right) { // пока они не столкнуться запускаем цикл
            if (word.charAt(left) == word.charAt(right)) { // сравниваем символы
                left++; // прибавляем по индексу
                right--; // уменьшаем по индексу
            } else {System.out.println("Ваше не слово палиндром");return;} // ответ и выброс
        }
        System.out.println("Ваше слово палиндром"); // ответ
    }
}
