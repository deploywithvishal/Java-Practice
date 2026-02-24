// Create a class Student with name and marks. Print details.

class Student {
    String name = "Vishal Kumar";
    int marks = 98;
}

class Program1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
    }
}

