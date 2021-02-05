public abstract class Instrument {

    private String type;
    private String sound;
    private String colour;
    private String material;
    private Float purchasePrice;

    public Instrument(String type, String sound, String colour, String material, Float purchasePrice){
        this.type = type;
        this.sound = sound;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
