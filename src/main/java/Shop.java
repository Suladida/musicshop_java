import com.sun.tools.javac.jvm.Items;
import items.ISell;
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

    public void addStock(Instrument instrument) {
        stock.add(instrument);
    }

    public void removeStock(Instrument instrument){
        stock.remove(instrument);
    }

    public Double calculateMarkup(ISell iSell){
        return iSell.calculateMarkup();
    }

}
