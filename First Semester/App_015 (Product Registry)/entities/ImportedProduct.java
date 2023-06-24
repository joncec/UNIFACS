package entities;

public class ImportedProduct extends Product {
    private double tax;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double tax) {
        super(name, price);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String getLabel() {
        return "R$:" + price + " (Imported)";
    }
}
