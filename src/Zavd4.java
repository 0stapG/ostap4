public class Zavd4 {
    public static void main(String[] args) {
        int[] array = {2, 8, 4, 7, 9}; // Приклад масиву

        // Змінюємо знак непарних елементів масиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }

        // Виводимо змінений масив
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
