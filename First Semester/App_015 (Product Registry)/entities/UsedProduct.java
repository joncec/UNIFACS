package entities;

public class UsedProduct extends Product {
    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String getLabel() {
        return "R$:" + price + " (Used)";
    }
}
