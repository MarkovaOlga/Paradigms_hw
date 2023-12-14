package hometask04;
import java.util.Arrays;
import java.util.OptionalDouble;
//Контекст
// Корреляция - статистическая мера, используемая для оценки связи между двумя случайными величинами.
//Ваша задача
// Написать скрипт для расчета корреляции Пирсона между двумя случайными величинами (двумя массивами). Можете
// использовать любую парадигму, но рекомендую использовать функциональную, т.к. в этом примере она значительно
// упростит вам жизнь

public class Main {
    public static void main(String[] args) {
        double[] arrayOne = new double[]{2, 4, 7, 8};
        double[] arrayTwo = new double[]{9, 11, 18, 20};
        System.out.println(calculatePirsonCorrelation(arrayOne, arrayTwo));
    }

    public static double calculatePirsonCorrelation(double[] arrayOne, double[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException("Длинна массивов должна быть одинаковой!");
        }
        double dividend = 0;
        double divider = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            double subtractionInFirstBrackets = arrayOne[i] - findAverage(arrayOne).getAsDouble();
            double subtractionInSecondBrackets = arrayTwo[i] - findAverage(arrayTwo).getAsDouble();
            dividend += subtractionInFirstBrackets * subtractionInSecondBrackets;
            divider += (subtractionInFirstBrackets*subtractionInFirstBrackets)*(subtractionInSecondBrackets*subtractionInSecondBrackets);
        }
        return dividend / Math.sqrt(divider);
    }

    public static OptionalDouble findAverage(double[] array) {
        return Arrays.stream(array).average();
    }
}
