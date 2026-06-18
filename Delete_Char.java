public class Delete_Char {
    // Удаление пробелов из строки
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Стихи уж точно не слова\n" +
                "С набором рифм и расстановкой точек,\n" +
                "Пускай  их целая глава,\n" +
                "Стихи лишь то, что сказано меж строчек.\n");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.delete(i, i + 1);
                i--;
            }
        }
        System.out.println(str.toString());
    }
}
