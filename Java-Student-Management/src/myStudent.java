public class myStudent {
    private String name;
    private int age;
    private String studentId;
    private double averageGrade;

    public myStudent(String name, int age, String studentId, double averageGrade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public double getAverageGrade() { return averageGrade; }
    public void setAverageGrade(double averageGrade) { this.averageGrade = averageGrade; }

    public void printStudentInfo() {
        System.out.println(this);
    }

    public boolean isPassed() {
        return averageGrade >= 50.0;
    }

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
