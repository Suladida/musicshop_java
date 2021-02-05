package items.instruments;

import items.Types;

public class Drumkit extends Instrument implements IPlay {

    int drums;

    public Drumkit(String colour, String material, Double purchasePrice, Double sellingPrice){
        super(Types.PERCUSSION, colour, material, purchasePrice, sellingPrice);
        drums = 5;
    }

    public String play() {
        return "Boooom";
    }

    public int getDrums(){return drums;}

}
