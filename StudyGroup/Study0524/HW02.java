package StudyGroup.Study0524;

import java.util.Arrays;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Students students = new Students();
        // 문제 3. Students 클래스에 학생의 성적을 입력받는 메서드를 입력받아 저장하는 메서드를 구현하시오.
        // 성적은 국어, 수학, 사회, 과학으로 구성
        // 메서드를 호출해 학생 3명의 성적을 입력받으시오.
        int [] alexGrade = new int[4];
        int [] tomGrade = new int[4];
        int [] benGrade = new int[4];
        alexGrade = students.getGrade(alexGrade);
        tomGrade = students.getGrade(tomGrade);
        benGrade = students.getGrade(benGrade);
        // 문제 4. 저장된 학생의 성적을 입력매게변수로 받아
        // 그 학생의 평균 점수를 반환하는 메서드를 구현 후 실행하시오.
        double alexAvg = students.getAvg(alexGrade);
        double tomAvg = students.getAvg(tomGrade);
        double benAvg = students.getAvg(benGrade);
//        System.out.println("a평균 : " + alexAvg);
//        System.out.println("b평균 : " + tomAvg);
//        System.out.println("c평균 : " + benAvg);
        // 문제 5. 반평균을 구하는 메서드를 구현 후 실행하시오.
        // 외부에서 평균값을 구한걸 넘겨 받아서 더한 후 리턴한 방식
        double [] avgClass = {alexAvg,tomAvg,benAvg};
        double totalClassAvg = students.getClassAvg(avgClass);
//        System.out.println(totalClassAvg);
        // 문제 5. 반평균을 구하는 메서드를 구현 후 실행하시오.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("점수 갯수 입력");
//        int check = scanner.nextInt();
//        int [] totalGrade = new int[check];
//        int count = 0;
//        //학생점수 입력받기
//        for (int i = 0; i < totalGrade.length; i++) {
//            System.out.println("점수를 입력하시오");
//            totalGrade[i] = scanner.nextInt();
//            count++;
//        }
//        //평균 구하기
//        int total = 0;
//        double avg = 0;
//        for (int i = 0; i < totalGrade.length; i++) {
//            total = total + totalGrade[i];
//        }
//        avg = (double) total/count;
//        System.out.println(avg);
    }
}
