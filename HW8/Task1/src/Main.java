import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми\

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000);
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.\

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).\

        /*for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }*/
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).\

        System.out.println("--------------------");

        /*int yarra[] = new int[5];

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < yarra.length; j++) {
                yarra[j] = array[i];
                System.out.println(yarra[j]);
                break;
            }
        }*/
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
