package instruments;

public class Bass extends Instrument implements IPlay {

    int strings;

    public Bass(String colour, String material, Double purchasePrice){
        super("Bass", colour, material, purchasePrice);
        strings = 4;
    }

    public String play() {
        return "Doooom";
    }

    public int getStrings(){return strings;}


}
