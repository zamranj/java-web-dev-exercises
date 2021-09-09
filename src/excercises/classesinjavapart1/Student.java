package excercises.classesinjavapart1;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    public String getName(){
        return this.name;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }
}
