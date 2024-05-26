package StudyGroup.Study0401;

import java.util.Random;
import java.util.Scanner;

/*
1~100까지의 숫자를 입력받는다
(조건1. 입력받은 값이 1~100의 범위를 넘어간 경우 Error 출력)
사용자가 입력한 숫자를 찾는 코드를 작성하고
그 숫자와 시도 횟수를 출력하시오.
 */
public class TimeAttact01 {
    public static void main(String[] args) {
        System.out.println("1~100까지의 숫자중 하나를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(1,100);
        System.out.println(randomNum);
        int count = 0;
        int userNum;
        for (int i = 0; ; i++) {
            userNum = scanner.nextInt();
            if (0 < userNum && userNum <= 100) {
                count++;
                if (userNum == randomNum) {
                    System.out.println("시도 횟수 : " + count);
                    System.out.println("정답 : " + userNum);
                    break;
                }
                System.out.println("틀렸습니다. 다시 입력해주세요. (횟수+1)");
            } else {
                System.out.println("Error : 입력범위초과");
            }
        }
    }
}
