package week2.methodOverloading;

public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    //Buna Overloaing denir. İki metodun ismi aynı ancak parametreleri farklı olduğu için sıkıntı olmaz ama overloading olur.
}
