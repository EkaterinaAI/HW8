import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double weight[] = new double[10];
        double summ = 0;
        int countPeople = 0;

        for (int i = 0; i < weight.length; i++) {
            weight[i] = new Random().nextDouble(40, 100);
            summ += weight[i];
            if (weight[i] >= 60 && weight[i] <= 80) {
                countPeople++;
            }
        }

        System.out.println("Средний вес: " + summ / weight.length);
        System.out.println("Количество людей с весом от 60 до 80: " + countPeople);
    }
}
