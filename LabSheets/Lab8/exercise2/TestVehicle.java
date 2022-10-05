package Lab8.exercise2;

public class TestVehicle {
    public static void main(String[] args) {

        System.out.println("Testing the Car no-arg constructor: \n");
        Car c1 =  new Car();
        System.out.println(c1+"\n\n");

        System.out.println("Testing the Car multi-arg constructor: \n");
        Car c2 =  new Car(
                10000,
                4.5,
                1.25,
                2000,
                "Ferrari",
                "F2",
                2,
                "08-KY-1234");
        System.out.println(c2+"\n\n");

        System.out.println("Testing the Bicycle no-arg constructor: \n");

        Bicycle b1 =  new Bicycle();
        System.out.println(b1+"\n\n");

        System.out.println("Testing the Bicycle multi-arg constructor: \n");
        Bicycle b2 =  new Bicycle(
                500,
                1.5,
                1.0,
                50,
                "Raleigh",
                "Mountainbike",
                4,
                true);
        System.out.println(b2);
    }
}
