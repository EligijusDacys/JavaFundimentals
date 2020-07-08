package Mobile;

public class Mobile {

    private String model;
    private String manufacturer;
    private  double price;

    public Mobile (String model, String manufacturer, double price){
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
