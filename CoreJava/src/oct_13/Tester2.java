package oct_13;

class Student {
    private int studentId;
    private String studentName;
    private double studentMarks;
    private char studentGrade;

    public void setStudentData(int id, String name, double marks) {
        this.studentId = id;
        this.studentName = name;
        this.studentMarks = marks;
    }

    public void calculateGrade() {
        if (studentMarks > 90) {
            studentGrade = 'A';
        } else if (studentMarks >= 81) {
            studentGrade = 'B';
        } else if (studentMarks >= 71) {
            studentGrade = 'C';
        } else if (studentMarks >= 61) {
            studentGrade = 'D';
        } else {
            studentGrade = 'E';
        }
    }

    public String displayDetails() {
        return "Id : " + studentId +
               "\nName : " + studentName +
               "\nMarks : " + studentMarks +
               "\nGrade : " + studentGrade;
    }
}
public class Tester2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentData(101, "Sonu", 95);
        s.calculateGrade();
        System.out.println(s.displayDetails());
    }
}
