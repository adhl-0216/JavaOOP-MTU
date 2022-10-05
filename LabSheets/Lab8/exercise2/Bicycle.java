package Lab8.exercise2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){}

    public Bicycle(
            double price,
            double length,
            double height,
            double weight,
            String manufacturer,
            String model,
            int gearCount,
            boolean hasBell
    ){
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public int getGearCount() {
        return gearCount;
    }
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    public boolean getHasBell(){
        return hasBell;
    }
    public void setHasBell(boolean hasBell){
        this.hasBell = hasBell;
    }

    public String toString() {
        String bell = (!hasBell) ? "No" : "Yes";
        return super.toString() +
                "\nHas bell: " +  bell +
                "\nGear Count: " + gearCount;
    }
}
