package PS1;

import javax.swing.*;

public class Qa {
    static String  rootType;
    public static void main(String[] args) {
        double a = 5, b = 4, c = 3;
        String [] roots = quadRoots(a,b,c);
        String output = String.format("The quadratic equation with a=%.1f b=%.1f c=%.1f has %s and their values are %s and %s.", a,b,c,rootType, roots[0], roots[1]);
        JOptionPane.showMessageDialog(null, output, "Quadratic Formula Calculator", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static String[] quadRoots(double a,double b,double c){
        String[] quadRoots = new String[2];
        double det = (b * b) - (4 * a * c);
        if(det >= 0){
            if(det == 0) rootType = "2 identical real roots";
            else rootType = "2 distinct real quadRoots";
            quadRoots[0] = String.format("%.3f", ((-1 * b) + Math.sqrt(det)) / (2 * a));
            quadRoots[1] = String.format("%.3f", ((-1 * b) - Math.sqrt(det)) / (2 * a));
        }else {
            det *= -1;
            double x, y;
            x = (-1*b)/(2*a);
            y = (-1*(Math.sqrt(det)))/(2*a);
            rootType = "2 complex conjugate roots";
            quadRoots[0] = String.format("%.3f", x) + "+i" + String.format("%.3f", Math.abs(y));
            quadRoots[1] = String.format("%.3f", x) + "-i" + String.format("%.3f", Math.abs(y));
        }

        return quadRoots;
    }
}
