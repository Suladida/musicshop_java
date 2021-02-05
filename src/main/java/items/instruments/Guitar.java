package items.instruments;

import items.Types;

public class Guitar extends Instrument implements IPlay {

    int strings;

    public Guitar(String colour, String material, Double purchasePrice, Double sellingPrice){
        super(Types.STRINGS, colour, material, purchasePrice, sellingPrice);
        strings = 6;
    }

    public String play() {
        return "Twaaang";
    }

    public int getStrings(){ return strings; }




}
