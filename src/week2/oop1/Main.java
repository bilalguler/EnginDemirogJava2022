package week2.oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.img");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(9);
        product2.setUnitPrice(10500);
        product2.setUnitInStock(5);
        product2.setImageUrl("image2.img");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(5);
        product3.setUnitPrice(6500);
        product3.setUnitInStock(2);
        product3.setImageUrl("image3.img");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("055522222");
        individualCustomer.setCustomerNumber("12345");

        individualCustomer.setFirstName("Bilal");
        individualCustomer.setLastName("Güler");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(34);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("02225667777");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("5432");


        Customer[] customers ={individualCustomer, corporateCustomer};

    }
}
