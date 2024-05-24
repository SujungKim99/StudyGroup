package StudyGroup.Study0522;

import java.util.Scanner;

public class NumberForHw {


    // 번외. 사용자에게 값 1개를 입력받는 메서드
    public int inputNum() {
       //System.out.println("[사용자에게 값 1개를 입력받는 메서드를 실행]합니다.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // 1. 유저에게 값을 입력받는 메서드
    public int [] saveUserInput(int num) {
        //System.out.println("[유저에게 값을 입력받는 메서드]를 실행합니다.");
        int [] numArray = new int[num];
        Scanner userInputNum = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = userInputNum.nextInt();
        }
        return numArray;
    }
    // 2. 최대값을 구하는 메서드
    public int findMaxNum(int [] numArray) {
        //System.out.println("[최대값을 구하는 메서드]를 실행합니다.");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max){
                max = numArray[i];
            }
        }
        return max;
    }
    // 3. 최소값을 구하는 메서드
    public int findMinNum(int [] numArray) {
        //System.out.println("[최소값을 구하는 메서드]를 실행합니다.");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < min){
                min = numArray[i];
            }
        }
        return min;
    }
}
