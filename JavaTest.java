import java.util.Arrays;

public class JavaTest
{
    public static void main(String[] args) {
        String[] names = {"Lara Connolly","Jaimie O Toole"};
        boolean compare = names[0].charAt(0) > names[1].charAt(0);
        System.out.println(names[0].charAt(0));
        System.out.println(names[1].charAt(0));
        System.out.println(compare);
//        System.out.println(Arrays.toString(names));
    }
}
