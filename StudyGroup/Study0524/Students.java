package StudyGroup.Study0524;

import java.util.Scanner;

public class Students {
    //문제 1.Students 클래스에 이름,나이,지역 필드를 생성하시오.
    String name;
    int age;
    String region;

    //문제 3.Students 클래스에 학생의 성적을 입력받는 메서드를 입력받아 저장하는 메서드를 구현하시오.
    public int [] getGrade(int [] array) {
        System.out.println("성적입력 국/수/사/과 순");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // 문제 4. 저장된 학생의 성적을 입력매게변수로 받아
    // 그 학생의 평균 점수를 반환하는 메서드를 구현 후 실행하시오.
    public double getAvg (int [] array) {
        int totalGrade = 0;
        for (int i = 0; i < array.length; i++) {
            totalGrade = totalGrade + array[i];
        }
        double avg = (double) totalGrade / array.length;
        return avg;
    }
    // 문제 5. 반평균을 구하는 메서드를 구현 후 실행하시오.
    // 외부에서 평균값을 구한걸 넘겨 받아서 더한 후 리턴한 방식
    public double getClassAvg (double [] avgArray) {
        double result = 0;
        for (int i = 0; i < avgArray.length; i++) {
            result = result + avgArray[i];
        }
        result = result/avgArray.length;
        return result;
    }

}
