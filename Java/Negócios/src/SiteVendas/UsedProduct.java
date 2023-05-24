package SiteVendas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDay;

    public UsedProduct(String name, Double price, Date manufactureDay) {
        super(name, price);
        this.manufactureDay = manufactureDay;
    }
    public Date getManufactureDay() {
        return manufactureDay;
    }

    public void setManufactureDay(Date manufactureDay) {
        this.manufactureDay = manufactureDay;
    }
    public String priceTag(){
        return name + ", R$ " + price + ", (Data de fabricação: " + sdf.format(manufactureDay) + ")";
    }
}
