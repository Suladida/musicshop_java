package items.accessories;

public class SheetMusic extends Accessory {

    String artist;
    String title;


    public SheetMusic(String artist, String title, String instrumentType, Double purchasePrice, Double sellingPrice) {
        super("Sheet Music", instrumentType, "white", "paper", purchasePrice, sellingPrice);
        this.artist = artist;
        this.title = title;
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }



}
