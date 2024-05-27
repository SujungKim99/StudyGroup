package StudyGroup.Study0415;

import java.util.Scanner;

//1번부터 5번까지 if문 활용
//6번부터 10번까지 for문 활용
//11번부터 15번까지 while문 활용
//16번부터 20번까지 do-while문 활용
//21번부터 22번까지는 switch문 활용
public class Example {
    public static void main(String[] args) {
        // 1. a가 100일때 true 출력하는 코드를 작성하시오. (a = 100)
        int a = 100;
        boolean result;
        if (a == 100) {
            result = true;
            System.out.println(result);
        }
        // 2. age가 0보다 작을때 : false, 0부터 7까지 중 하나일 때는 유치원, 8부터 13중 하나일 때는 초등학생,
        // 14부터 16까지 중 하나일때는 중학생, 17부터 19까지중 하나일 때는 고등학생, 나머지일때는 성인을 출력하는코드를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하시오");
        int age = scanner.nextInt();
        String result02;
        if (age < 0) {
            result02 = "false";
        } else if (age <= 7) {
            result02 = "유치원";
        } else if (age <= 13) {
            result02 = "초등학생";
        } else if (age <= 16) {
            result02 = "중학생";
        } else if (age <= 19) {
            result02 = "고등학생";
        } else {
            result02 = "성인";
        }
        System.out.println(result02);
        // num1은 10, num2는 20, num3은 100, num4는 50일때,
        int num1 = 10, num2 = 20, num3 = 100, num4 = 50;
        // 4. 합이 50이상이면 true, 이외는 fales를 출력하는 코드를 작성하시오.
        int sum = num1 + num2 + num3 + num4;
        boolean result04;
        if (sum > 50) {
            result04 = true;
        } else  {
            result04 = false;
        } System.out.println(result04);
        // 5. num1과 num2의 곱이 num3과 num4의 합의 크기보다 큰것이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
        boolean result05;
        if ( (num1 * num2) > (num3 + num4) ) {
            result05 = true;
        } else {
            result05 = false;
        } System.out.println(result05);
        // 6. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
        System.out.println("범위를 입력하시오.");
        int bound = scanner.nextInt();
        System.out.println("철수가 현재까진 센 수를 입력하시오");
        int nowNum = scanner.nextInt();
        for(int i = nowNum; i <= bound; i++) {
            System.out.println(i);
        }
        // 7. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
        int result07;
        for (int i = 0; i <= 5; i++) {
            result07 = i + 3;
            System.out.println(result07);
        }
        // 8. 100부터 90까지의 숫자를 출력하시오
        for (int i = 100; i >= 90; i--) {
            System.out.println(i);
        }
        // 9. 5번 반복해서 55,66,77,88,99,110을 출력하는 코드를 작성하시오.
        for (int i = 5; i <= 10; i++) {
            int result09 = i * 11;
            System.out.println(result09);
        }
        // 10. (o,p)o은 0부터 10까지,p은 100부터 90까지 출력하는 코드를 작성하시오.
        int o = 0;
        int p = 100;
        for (int i = 0; i <= 10; i++) {
            System.out.println(o);
            System.out.println(p);
            o++;
            p--;
        }
        // 11. f가 10이고 g가 5일때 두 변수를 곱한 값이 50이면 '값은 50입니다.', 60이면 '값은 60입니다.'를 출력하는 코드를 작성하시오.
        int f = 10;
        int g = 5;
        int mul = f * g;

        if ( (f * g) == 50 ) {
            System.out.println("값은 50입니다.");
        } else if (mul == 60) {
            System.out.println("값은 60입니다.");
        }
        // 12. numf는 100, nums는 50일때 두 수를 더한 값이 150이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
        int numf = 100, nums = 50;
        boolean bool;
        if ( (numf + nums) == 150) {
            bool = true;
        } else {
            bool = false;
        }
        System.out.println(bool);
    }
}



