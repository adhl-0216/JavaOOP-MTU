package PS5;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, int powerSupply, Dimension dimensions) {
        setModel(model);
        setManufacturer(manufacturer);
        setPowerSupply(powerSupply);
        setDimensions(dimensions);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimension getDimensions() {
        return new Dimension(dimensions.getLength(), dimensions.getWidth(), dimensions.getHeight());
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = new Dimension(dimensions.getLength(), dimensions.getWidth(), dimensions.getHeight());
    }

    @Override
    public String toString() {
        return "Model: " + model +
                ", Manufacturer: " + manufacturer +
                ", Power Supply: " + powerSupply +"V" +
                ", Dimensions: " + dimensions;
    }
}
