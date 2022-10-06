package week2.classesWithAttributes;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    // Product classının bir adet parametresiz bir adette 6 adet parametreli CONSTRUCTOR u var. Buna "overloading-aşırı
    // yükleme" denir. İsteyen parametreli isteyen parametresiz kullanır.
    public Product() {

    }
    //attribute | field
    private int id;
    //aslında String, int gibi değişkenlerin önlerinde public  vardır. Sınıftan kkaynaklı.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    //private olması sadece tanımlandığı blokta geçerli olduğunu söyler. Yani bi üstündeki süslü
    //parantezde geçerli.
    private String renk;

    //getter
    public int getId() {  //get sadece okur.
        return id;
    }

    //setter
    public void setId(int id) { // set yazma yapar.
        this.id = id;
        //this.id = id;
        //this bu bulunduğumuz class demektir.
        //ya da tanımlarken bu classta olanların önüne _ koyarız.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}
