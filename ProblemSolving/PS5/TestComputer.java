package PS5;

public class TestComputer {
    public static void main(String[] args) {
        Computer[] allPC = new Computer[3];
        allPC[0] = new Computer(new Case("Optiplex", "Dell",240, new Dimension(275,250,100)), "Acer 5363", "Asus 2345");
        allPC[1] = new Computer(new Case("Optiplex", "Dell",230, new Dimension(315,300,120)), "LG 3241", "Intel 6533");
        allPC[2]= new Computer(new Case("i-Blason", "Apple",115, new Dimension(250,275,110)), "HP 5433", "AMD 1942");

        System.out.println("Displaying the state of the 3 Computer objects at this point");

        for (int i = 0; i < allPC.length; i++) {
            System.out.println("Computer " + i+1 + "\n" + allPC[i] + "\n\n");
        }

        System.out.println("Now displaying a list of any Computer objects whose case model includes the word \"Optiplex\"\n");

        for (Computer pc :
                allPC) {
            if (pc.getCompCase().getModel().equals("Optiplex")){
                System.out.println(pc + "\n\n");
            }
        }
    }
}
