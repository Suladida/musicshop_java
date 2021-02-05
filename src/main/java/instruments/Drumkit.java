package instruments;

public class Drumkit extends Instrument implements IPlay {

    int drums;

    public Drumkit(String colour, String material, Double purchasePrice){
        super("Drumkit", colour, material, purchasePrice);
        drums = 5;
    }

    public String play() {
        return "Boooom";
    }

    public int getDrums(){return drums;}


}
