package StudyGroup.Study0528;

public class Example {
    public static void main(String[] args) {
        Student student = new Student("alex",26,"male");
        String studentInfo = student.printStudentInfo();
        System.out.println(studentInfo);
    }
}
