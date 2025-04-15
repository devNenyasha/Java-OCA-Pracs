# **Java Student Management Program**

## **Description**

This is a simple Java program that models student information using a myStudent class. It demonstrates object-oriented programming (OOP) principles such as encapsulation, constructors, getters & setters, method overriding, and the toString() method for object representation.

## **Features**

* Stores student details: name, age, student ID, and average grade

* Prints student information using toString()

* Determines if a student has passed (average grade >= 50.0)

* Demonstrates object creation and method calls in the main() method

## **Technologies Used**

* Java (JDK 11, 17, or 21)

* IntelliJ IDEA (Recommended for development)

## **How to Run**

## **1. Clone the Repository**

```
git clone https://github.com/your-username/Java-OCA-Practice.git
cd Java-OCA-Practice
```

## **2. Compile the Program**

```
javac Main.java myStudent.java
```

## **3. Run the Program**
```
java Main
```

## **Code Overview**

## **Main.java**
```
public class Main {
public static void main(String[] args) {
// Student objects
myStudent student1 = new myStudent("Alex", 20, "ST102", 67.5);
myStudent student2 = new myStudent("Lisa", 22, "ST203", 45.0);

        // Print student objects using toString()
        System.out.println(student1);
        System.out.println(student2);
    }
}
```

## **myStudent.java**
```
public class myStudent {
    private String name;
    private int age;
    private String studentId;
    private double averageGrade;

    // Constructor
    public myStudent(String name, int age, String studentId, double averageGrade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Method to print student info
    public void printStudentInfo() {
        System.out.println(this);
    }

    // Method to check if student passed
    public boolean isPassed() {
        return averageGrade >= 50.0;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Student ID: " + studentId + "\n" +
                "Average Grade: " + averageGrade + "\n" +
                "Passed: " + isPassed() + "\n" +
                "----------------------";
    }
}

```

## **Expected Output**
```
Name: Alex
Age: 20
Student ID: ST102
Average Grade: 67.5
Passed: true
----------------------
Name: Lisa
Age: 22
Student ID: ST203
Average Grade: 45.0
Passed: false
----------------------
```

## **Future Improvements**

* Add user input for dynamic student creation

* Store multiple students in a list

* Implement file handling to save student data


## **License**

This project is open-source. Feel free to modify and improve it!
