package instruments;

public class Guitar extends Instrument implements IPlay {

    public Guitar(String colour, String material, Double purchasePrice){
        super("Guitar", colour, material, purchasePrice);
    }

    public String play() {
        return "Twaaang";
    }


}
