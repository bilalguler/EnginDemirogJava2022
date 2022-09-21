package week1;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number = 27;
        int sum = 0;

        if (number < 1) {
            System.out.println("Geçersiz bir sayı girdiniz..");
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır..");
        } else {
            System.out.println(number + " bir mükemel sayı değildir..");
        }
    }
}
