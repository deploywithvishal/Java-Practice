// Create a class Rectangle with area method.

class Rectangle {
    int length;
    int breadth;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Program2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        r.area();
    }
}