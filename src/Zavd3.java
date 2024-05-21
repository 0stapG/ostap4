public class Zavd3 {
    public static void main(String[] args) {
        double[] array = {8.5, 12.2, 33.8, 2.1, 15.4}; // Приклад масиву

        // Обчислення суми елементів масиву
        double sum = 0;
        for (double value : array) {
            sum += value;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
