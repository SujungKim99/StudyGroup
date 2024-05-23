package StudyGroup.Study0522;

import java.util.Arrays;
import java.util.Scanner;

// 공통 조건 : 3개의 과제 클래스에서 필요한 외부 클래스는 하나의 클래스 NumberForHw로 통일하여 사용
public class HW03 {
    //유저에게 10개의 정수형 데이터를 입력받아 최소값과 최대값을 찾는 코드를 작성하시요.
    //최소값과 최대값을 구하는 메서드를 각각 만드시오.
    public static void main(String[] args) {
        //인스턴스화
        NumberForHw numberForHw = new NumberForHw();
        // 번외. 사용자에게 값 1개를 입력받는 메서드
        int num = numberForHw.inputNum();
        // 1. 유저에게 값을 입력받는 메서드 호출
        int [] intArray = intArray = numberForHw.saveUserInput(num);
        // 2. 최대값을 구하는 메서드 호출
        int max = numberForHw.findMaxNum(intArray);
        // 3. 최소값을 구하는 메서드 호출
        int min = numberForHw.findMinNum(intArray);

//        System.out.println("유저가 입력한 값 : "+ Arrays.toString(intArray));
//        System.out.println("최대값 : " + max);
//        System.out.println("최소값 : " + min);

    }
}
