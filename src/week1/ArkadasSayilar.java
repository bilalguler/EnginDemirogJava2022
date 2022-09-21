package week1;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                sum1 += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                sum2 += j;
            }
        }

        if (number1 == sum2 && number2 == sum1) {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaştır..");
        } else {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaştır değildir..");
        }
    }
}
