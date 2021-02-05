import com.sun.tools.javac.jvm.Items;
import items.ISell;
import items.accessories.Accessory;
import items.instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    String name;
    ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell iSell) {
        stock.add(iSell);
    }

    public void removeStock(ISell iSell){
        stock.remove(iSell);
    }

    public Double calculateMarkup(ISell iSell){
        return iSell.calculateMarkup();
    }

    public double calculateTotalMarkup() {
        Double markupTotal = 0.0;
        for (ISell item : stock) {
            markupTotal = markupTotal + item.calculateMarkup();
        } return markupTotal;
    }
}
