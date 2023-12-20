package hometask06;
//Ваша задача
//Написать программу на любом языке в любой парадигме для
//бинарного поиска. На вход подаётся целочисленный массив и
//число. На выходе - индекс элемента или -1, в случае если искомого
//элемента нет в массиве.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 6, 8, 10, 15, 18};
        System.out.println(binarySearch(array, 19));
    }

    public static int binarySearch(int[] array, int number) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + ((highIndex - lowIndex)/2);
            if (number == array[middleIndex]) {
                return middleIndex;
            } else if (number > array[middleIndex]) {
                lowIndex = middleIndex + 1;
            } else if (number < array[middleIndex]) {
                highIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
