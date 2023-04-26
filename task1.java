// Пусть дан произвольный список целых чисел, удалить из него четные числа

package third_dz;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива : ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("\n Первоначальный массив : ");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = random.nextInt(2, 21); 
        }
        for (int i = 0; i < arr_size; i++) {
            System.out.print(" " + arr[i]); 
        }
        System.out.println("\n Отсортированный массив только с нечетными числами : ");
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] % 2 == 1) { // проверка на четность
                System.out.printf(" " + arr[i]);
            }
        }
        sc.close();
    }
}