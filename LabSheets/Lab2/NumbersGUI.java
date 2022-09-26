package Lab2;

public class NumbersGUI {
    public static void main(String[] args) {
        int[] frameSize = {500,150};
        appWindow mainframe  = new appWindow(
                "Numbers Application",
                frameSize,
//                20,
                "Please enter your numbers here",
                "No numbers entered yet"
                );
        mainframe.prepareGUI();
        mainframe.inputField("Please enter your numbers here",20);
    }
}
