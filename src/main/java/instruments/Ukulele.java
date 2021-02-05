package instruments;

public class Ukulele extends Instrument implements IPlay {

    int strings;

    public Ukulele(String colour, String material, Double purchasePrice, Double sellingPrice){
        super("String", colour, material, purchasePrice, sellingPrice);
        strings = 4;
    }

    public String play() {
        return "Triiing";
    }

    public int getStrings(){
        return strings;
    }


}
