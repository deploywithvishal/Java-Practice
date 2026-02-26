// Create a class Employee with static company name.
class Employee{
    static String company = "DigiCore Future";
    String name;
    int age;

    Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("Company: "+company);
        System.out.println("Name: "+name);
        System.out.println("Age:"+age);
        System.out.println("");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal", 22);
        Employee e2 = new Employee("Shashi", 21);

        e1.show();
        e2.show();
    }
}
