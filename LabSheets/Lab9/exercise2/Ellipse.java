package Lab9.exercise2;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse() {
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public String toString() {
        return "Shape Type: Ellipse\n" + "Area: " + area() + "\nPerimeter: "+ perimeter();
    }

    public double area() {
        return Math.PI*majorAxis*minorAxis;
    }

    public double perimeter() {
        return 2*Math.PI*Math.sqrt(((majorAxis*majorAxis)+(minorAxis*minorAxis))/2);
    }
}
