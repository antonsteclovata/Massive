public class SecondMax_CheckMassive {
    // Найти масимальное число и второе максимальное число
    public static void main(String[] args) {
        int [] numbers = {2, 6, 5, 3, 8, 9};
        int max = numbers[0];
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = 0;
        int secondMaxIndex = 0;
        int index = 0;
        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = num;
                maxIndex = index;
            } else if (num > secondMax && num < max) {
                secondMax = num;
                secondMaxIndex = index;
            }
            index++;
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(maxIndex);
        System.out.println(secondMaxIndex);
    }
}
