package hometask01;

import java.util.*;

//Задача №1
//Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
//сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
//Задача №2
//Написать точно такую же процедуру, но в декларативном стиле

public class Main {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random rnd = new Random();
    for (int i = 0; i < 10; i++) {
        list.add(rnd.nextInt(10,40));
    }
    System.out.println("Список до сортировки: " + list);
    sortListImperative(list);
    System.out.println("Список после сортировки: " + list);
    }

    public static void sortListImperative(List<Integer> list){
        int sizeOfList = list.size();
        for (int i = 0; i < sizeOfList; i++) {
            for (int j = i + 1; j < sizeOfList; j++) {
                int currentValue = list.get(i);
                int nextValue = list.get(j);
                if(currentValue < nextValue){
                    list.set(j, currentValue);
                    list.set(i, nextValue);
                }
            }
        }
    }

    public static void sortListDeclarative(List<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
    }
}

