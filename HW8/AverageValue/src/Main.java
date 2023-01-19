import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int people[] = new int[50];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }

        double summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }

        System.out.println("Средний возраст: " + summ / people.length);
    }
}
