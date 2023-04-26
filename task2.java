// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

package third_dz;

import java.util.*;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка : ");
        int size = sc.nextInt(); // создали переменную для размерности списка
        List<Integer> list = createList(size); // лист имеет список size
        System.out.println("Изначальный список : " + list);
        sort(list);
        System.out.printf("Отсортированный список : %s  \nМинимальное значение = %d \nМаксимальное = %d ", list,
                list.get(0), list.get(size - 1));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int averageSum = sum / size;
        System.out.printf("\nСреднее арифметическое = %d ", averageSum);
    }

    static void sort(List<Integer> list) { 
        Collections.sort(list);
    }

    static List<Integer> createList(int capacity) { 
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            Random random = new Random();
            result.add(random.nextInt() / 10000000);
        }
        return result;
    }
}