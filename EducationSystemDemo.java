


// One more example

public class EducationSystemDemo {
public static void main(String[] args) {
// Creating an instance of Student
Student student = new Student("Alice", 20, "S123456");
student.displayInfo();
System.out.println(); // Print ablank line for readability
// Creating an instance of Teacher
Teacher teacher = new Teacher("Bob", 45, "Mathematics");
teacher.displayInfo();
}
// Person class
static class Person {
protected String name;
protected int age;
// Constructor
public Person(String name, int age) {
this.name = name;
this.age = age;
}
// Display information
public void displayInfo() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
// Student class
static class Student extends Person {
private String studentID;
// Constructor

public Student(String name, int age, String studentID) {
super(name, age); // Call the superclass constructor
this.studentID = studentID;
}
// Override displayInfo method
@Override
public void displayInfo() {
super.displayInfo(); // Call the superclass method
System.out.println("Student ID: " + studentID);
}
}
// Teacher class
static class Teacher extends Person {
private String subject;
// Constructor
public Teacher(String name, int age, String subject) {
super(name, age); // Call the superclass constructor
this.subject = subject;
}
// Override displayInfo method
@Override
public void displayInfo() {
super.displayInfo(); // Call the superclass method
System.out.println("Teaches: " + subject);
}
}
}