package items.instruments;

import items.ISell;
import items.Types;

public abstract class Instrument implements IPlay, ISell {

    private Enum<Types> type;
    private String colour;
    private String material;
    private Double purchasePrice;
    private Double sellingPrice;

    public Instrument(Enum<Types> type, String colour, String material, Double purchasePrice, Double sellingPrice){
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public Enum<Types> getType() {
        return type;
    }

    public void setType(Enum<Types> type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSellingPrice(){
        return sellingPrice;
    }

    public Double calculateMarkup() {
        return sellingPrice - purchasePrice;
    }

}
