package Lab9.exercise1;

public final class SelfEmployedWorker extends Employee {
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = earnings();
    }

    public double earnings(){
        return Math.random()*500+400;
    }

    @Override
    public String toString() {
        return  "Self-employed worker's name is " + super.toString() +
                ", and the earnings were " + String.format("\u20ac%.2f",earnings());
    }
}
