package items.instruments;

import items.Types;

public class Bass extends Instrument implements IPlay {

    int strings;

    public Bass(String colour, String material, Double purchasePrice, Double sellingPrice){
        super(Types.STRINGS, colour, material, purchasePrice, sellingPrice);
        strings = 4;
    }

    public String play() {
        return "Doooom";
    }

    public int getStrings(){return strings;}
}
