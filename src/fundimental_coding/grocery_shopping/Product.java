package fundimental_coding.grocery_shopping;

public class Product {

    public String name;
    public double price;

    public Product(String name, double price) {
    this.name = name;
    this.price = price;



    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
