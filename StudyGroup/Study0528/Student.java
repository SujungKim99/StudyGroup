package StudyGroup.Study0528;

public class Student {
    String name;
    int age;
    String gender;


    //기본생성자
    public Student() {
    }
    //기본생성자가 아닌 생성자
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String printStudentInfo(){
        String studentInfo = "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender;
        return studentInfo;
    }
}
