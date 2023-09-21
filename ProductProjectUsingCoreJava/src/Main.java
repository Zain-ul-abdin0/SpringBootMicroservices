public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Mac","Waptop","Lhr",1);
        Product product2 = new Product("Lac","Eaptop","Lhr",1);
        Product product3 = new Product("Oac","Raptop","Lhr",1);
        Product product4 = new Product("Pac","Qaptop","Lhr",1);
        Product product5 = new Product("Zac","Daptop","Lhr",1);
        Product product6 = new Product("Aac","Faptop","Lhr",1);
        Product product7 = new Product("Sac","Gaptop","Lhr",1);
        Product product8 = new Product("Dac","Captop","Lhr",3);

        ProductService productService = new ProductService();
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
        productService.addProduct(product4);
        productService.addProduct(product5);
        productService.addProduct(product6);
        productService.addProduct(product7);
        productService.addProduct(product8);

//        productService.findProductWithName("Zac");
//        productService.findProductWithPlace("Lhr");

        productService.findProductWithOutOfWarranty(2);
    }
}