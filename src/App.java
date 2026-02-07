public class App {
    public static void main(String[] args) throws Exception {
        AbstractShape abstractShape = new Circle(5);
        System.out.println(abstractShape.getName());
        abstractShape.display();

        abstractShape = new Rectangle(4, 6);
        System.out.println(abstractShape.getName());
        abstractShape.display();
    }
}
