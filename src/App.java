public class App {
    public static void main(String[] args) throws Exception {
        Box<AbstractShape> shapeBox = new Box<>(); //initialize a Box to hold AbstractShape objects
        shapeBox.setItem(new Circle(5)); //put a Circle object in the box
        AbstractShape boxShape = shapeBox.getItem(); //retrieve the Circle object from the box
        System.out.println(boxShape.getName());//print the name of the shape
        boxShape.display();//display the shape's details
        //rectangle part
        shapeBox.setItem(new Rectangle(4, 6));
        boxShape = shapeBox.getItem();
        System.out.println(boxShape.getName());
        boxShape.display();

        //traiangle part
        shapeBox.setItem(new triangle(3, 4, 5));
        boxShape = shapeBox.getItem();  
        System.out.println(boxShape.getName());
        boxShape.display();
        
    }
}
