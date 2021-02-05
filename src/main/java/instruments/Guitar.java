package instruments;

public class Guitar extends Instrument implements IPlay {

    int strings;

    public Guitar(String colour, String material, Double purchasePrice){
        super("Guitar", colour, material, purchasePrice);
        strings = 6;
    }

    public String play() {
        return "Twaaang";
    }

    public int getStrings(){ return strings; }




}
