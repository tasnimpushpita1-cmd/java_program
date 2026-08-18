class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student(101, "Rahim", 3.75);
        Student student2 = new Student(102, "Karim", 3.60);
        Student student3 = new Student(103, "Jarin", 3.90);

        student1.display();
        student2.display();
        student3.display();
    }
}