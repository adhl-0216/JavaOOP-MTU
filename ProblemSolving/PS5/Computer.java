package PS5;

public class Computer {
    private Case compCase;
    private String monitor;
    private String motherboard;

    public Computer(Case compCase, String monitor, String motherboard) {
        setCompCase(compCase);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public Case getCompCase() {
        return new Case(compCase.getModel(), compCase.getManufacturer(), compCase.getPowerSupply(), compCase.getDimensions());
    }

    public void setCompCase(Case compCase) {
        this.compCase = new Case(compCase.getModel(), compCase.getManufacturer(), compCase.getPowerSupply(), compCase.getDimensions());
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Case Details: \n\t" + compCase +
                "\nMonitor: " + monitor +
                "\nMotherboard: " + motherboard;
    }
}
