// Create a class Circle with constructor.
class Circle{
    final double pi = 3.14;
    double radius;

    Circle(double r){
        radius = r;
    }

    double radius(){
        return pi*radius*radius;
    }

}

public class Program3 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of circle: "+ c.radius());
    }
}
