package Lab5.exercise3;

public class Thermometer {
    private int currTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer(){
        setCurrTemp(0);
        setMaxTemp(Integer.MAX_VALUE);
        setMinTemp(Integer.MIN_VALUE);
    }

    public Thermometer(int temp){
        setCurrTemp(temp);
        setMaxTemp(temp);
        setMinTemp(temp);
    }

    public void setTemperature(int setTemp){
        setCurrTemp(setTemp);
        if(this.maxTemp == Integer.MAX_VALUE) setMaxTemp(setTemp);
        if(this.minTemp == Integer.MIN_VALUE) setMinTemp(setTemp);
        updateMaxMinTemp();
    }

    private void updateMaxMinTemp() {
        if(this.currTemp > this.maxTemp)
            this.maxTemp = this.currTemp;
        if(this.currTemp < this.minTemp)
            this.minTemp = this.currTemp;
    }

    private void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    private void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    private void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String toString() {
        return String.format(
                " Current temperature: %d%n Maximum temperature: %d%n Minimum temperature: %d%n",
                this.currTemp, this.maxTemp, this.minTemp);
    }
}
