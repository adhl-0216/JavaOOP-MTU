package Lab8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        Car c1 =  new Car();
        System.out.println(c1+"\n\n");
        Bicycle b1 =  new Bicycle();
        System.out.println(b1+"\n\n");
        Car c2 =  new Car(10000, 4.5, 1.25, 2000, "Ferrari", "F2", 2, "05KY1");
        System.out.println(c2+"\n\n");
        Bicycle b2 =  new Bicycle();
        System.out.println(b2);
    }
}
