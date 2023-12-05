package hometask02;
//Условие
//        На вход подается число n.
//        ● Задача
//        Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
//        Обоснуйте выбор парадигм.
//        ● Пример вывода:
//        1 * 1 = 1
//        1 * 2 = 2
//        ..
//        1 * 9 = 9
public class Main {
    public static void main(String[] args) {
        int number = 9;
        MultiplicationTable(number);
    }

    public static void MultiplicationTable(int number) {
        for (int i = 1; i < 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}


