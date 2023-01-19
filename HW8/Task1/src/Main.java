import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000);
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        /*for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }*/
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo

        System.out.println("--------------------");

        int yarra[] = new int[5];

        for (int i = array.length - 1; i >= 0; i--) {
            int value = array[i];
            for (int j = 0; j < yarra.length; j++) {
                yarra[j] = value;
                System.out.println(yarra[j]);
                break;
            }
        }
    }
}
