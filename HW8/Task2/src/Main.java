import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int weight[] = new int[10];
        double summ = 0;
        int countPeople = 0;

        for (int i = 0; i < weight.length; i++) {
            weight[i] = new Random().nextInt(40, 100);
        }

        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
            summ += weight[i];
        }

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] >= 60 && weight[i] <= 80) {
                countPeople++;
            }
        }

        System.out.println("Средний вес: " + summ / weight.length);
        System.out.println("Количество людей с весом от 60 до 80: " + countPeople);
    }
}
