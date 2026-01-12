package ch09_getter_setter.univ_student;

// 쉬움
public class UnivStudent {

    // 필드 변수 선언 근데 왜 private으로 선언 안했지?
    String name;
    int grade;
    double score;

    // 기본 생성자
    public UnivStudent() {
    }

    // 생성자 매개변수 확인하고
    public UnivStudent(String name) {
        this.name = name;
    }

    // 생성자 매개변수!
    public UnivStudent(int grade) {
        this.grade = grade;
    }

    // 생성자 매개변수
    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // 생성자 AllArgsConstructor임
    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    // 이하는 getter임
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    // 이하는 setter임
    public void setName(String name) {
        this.name = name;
    }


    public void setScore(double score) {
        if (score < 0 || score>4.5){
            return;
        }
        this.score = score;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade>4){
            return;
        }
        this.grade = grade;

    }

    // 이거 모르면 죽어야함
    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("점수 : " + score);
    }
}
