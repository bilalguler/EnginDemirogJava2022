package week2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product Product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        productManager.Add2(1, "", "", 2, 200);
        //Hatalı kullanım. Herhangi bir ekleme yaptığımız zaman bunu yazdığımız bütün sayfalarda
        //düzeltmemiz gerekecektir. Bu yüzden kullanışlı bir kod değildir.

    }
}
