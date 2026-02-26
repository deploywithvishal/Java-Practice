// Create a class Car with parameterized constructor.
class Car{
    String model;
    int year;

    Car(String model,int year){
        this.model = model;
        this.year = year;
    }

    void show(){
        System.out.println("model: "+model);
        System.out.println("year:"+year);
        System.out.println("");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Car e1 = new Car("Datsun", 2025);
        Car e2 = new Car("Toyota", 2026);

        e1.show();
        e2.show();
    }
}

