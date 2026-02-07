public abstract class AbstractShape implements Shape {
    
    public void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public abstract String getName();



}
