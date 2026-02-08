public class triangle extends AbstractShape {
    private double base;
    private double height;   
    private double sideC;

    public triangle(double base, double height, double sideC) {
        this.base = base;
        this.height = height;
        this.sideC = sideC;
    }

    @Override 
    public String getName() {
        return "Triangle";
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }


    @Override
    public double perimeter() {
        return height + base + sideC;
    }
}
