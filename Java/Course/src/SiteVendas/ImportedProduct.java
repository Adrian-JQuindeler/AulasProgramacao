package SiteVendas;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }
    public String priceTag(){
        Double valor = price + customFee;
        return name + ", R$ " + valor + ", (Custom Fee: R$ " + customFee + ")";
    }
}
