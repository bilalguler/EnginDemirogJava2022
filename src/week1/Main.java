package week1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //değişken isimleri java'da camelCase yazılır.
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        int vade = 12;

        double dolarDun = 18.1 ;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;  //true

        String okYonu = "";

        if (dolarBugun<dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if (dolarBugun==dolarDun) {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}
