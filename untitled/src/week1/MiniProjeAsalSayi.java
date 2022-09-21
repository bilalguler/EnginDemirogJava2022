package week1;

public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 2;
        int remander = number % 2;
        int i = 2;

        if (number <= 1) {
            if (number == 1) {
                System.out.println(number + " bir asal sayı değildir.");
                return;
            } else {
                System.out.println("Geçersiz bir sayı girdiniz..");
                return;
            }
        }

        boolean isPrime = true;

        for (int j = 2; j<number; j++) {
            if (number % j == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
