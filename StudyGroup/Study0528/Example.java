package StudyGroup.Study0528;

public class Example {
    public static void main(String[] args) {
        Student student01 = new Student("alex",26,"male");
        Student student02 = new Student("ben",30,"male");
        Student student03 = new Student("mishel",23,"female");
        String student01Info = student01.printStudentInfo();
        String student02Info = student02.printStudentInfo();
        String student03Info = student03.printStudentInfo();
        System.out.println(student01Info);
        System.out.println(student02Info);
        System.out.println(student03Info);

        System.out.println(student01.name);
        System.out.println(student02.name);
        System.out.println(student03.name);
    }
}
