package ch08_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {

    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}
