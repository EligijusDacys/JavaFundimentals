package fundimental_coding.grocery_shopping;

import java.util.Scanner;

public class GroceryShoppingMain {

    public static void main(String[] args){
        Product[] products = initializeProducts();

        totalPriceOfProducts(products);
    }

    private static void totalPriceOfProducts(Product[] products) {
        double totalPrice = 0;
        for (Product product : products){
            totalPrice += product.price;
        }


        System.out.println("Galutinė sume uz viska =" + totalPrice);
    }

    private static Product[] initializeProducts() {
        Product[] products = new Product[2];


        Scanner inputScanner = new Scanner(System.in);
        for (int index = 0; index < 2; index++ ){

            System.out.println("Iveskite produkto pavadinima");
            String productName = inputScanner.nextLine();

            System.out.println("Iveskite produkto kaina");
            double productPrice = inputScanner.nextDouble();

            products[index] = new Product(productName, productPrice);
        }
        return products;
    }
}
