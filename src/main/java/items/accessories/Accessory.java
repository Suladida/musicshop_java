package items.accessories;

import items.ISell;

public abstract class Accessory implements ISell {

    private String type;
    private String instrumentType;
    private String colour;
    private String material;
    private Double purchasePrice;
    private Double sellingPrice;

    public Accessory(String type, String instrumentType, String colour, String material, Double purchasePrice, Double sellingPrice){
        this.type = type;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
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

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double calculateMarkup() {
        return sellingPrice - purchasePrice;
    }
}
