package instruments;

public class Ukulele extends Instrument implements IPlay {

    public Ukulele(String colour, String material, Double purchasePrice){
        super("Ukulele", colour, material, purchasePrice);
    }

    public String play() {
        return "Triiing";
    }


}
