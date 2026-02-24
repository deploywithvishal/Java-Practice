// Create a class Rectangle with area method.

class Rectangle {

    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class Program2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7);
        System.out.println("Area: " + r1.area());
    }
}
