package PS1;

public class Qa {
    static String  rootType;
    public static void main(String[] args) {
        double [] r1r2 = roots(1, 5, 4);
        System.out.println(String.format("The quadratic equation has %s and their values are %.3f and %.3f.",rootType, r1r2[0],r1r2[1]));
    }

    public static double[] roots(double a,double b,double c){
        double[] roots = new double[2];
        double det = b * b - 4 * a * c;
        if(det >= 0){
            if(det == 0) rootType = "2 identical real roots";
            else rootType = "2 distinct real roots";
            roots[0] = (-1*b + Math.pow(det,0.5))/2*a;
            roots[1] = (-1*b - Math.pow(det,0.5))/2*a;
        }

        return roots;
    }
}
