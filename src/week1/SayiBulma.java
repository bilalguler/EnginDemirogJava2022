package week1;

public class SayiBulma {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 0;
        boolean varMi = false;

        /*for (int i = 0; i < numbers.length; i++) {
            if (aranacak == numbers[i]) {
                varMi = true;
                break;
            } else {
                varMi = false;
            }
        }*/

        for (int number : numbers) {
            if (number == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur..");
        } else {
            System.out.println("Sayı mevcut değildir..");
        }
    }
}
