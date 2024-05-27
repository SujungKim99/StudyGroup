package StudyGroup.Study0416;
//1. 무한루프 for문 생성
//2.  0부터 모든수를 나타내는 무한루프 생성
//3. 제어키워드를 사용해 무한루프 탈출
//4. 조건을 걸어 10까지 출력후 탈출 하는 무한루프 생성

//0~10까지의 숫자 중
// 1. 2의 배수
// 2. 3의 배수
// 3. 1과 2의 숫자들의 총합
// 4. 그 숫자들의 총 합이 짝수인지 홀수 인지 나타내라.

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        //무한루프
        for (int i = 0; ; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }
        //0~10까지의 숫자 중
        int []two = new int[6];
        int []three = new int[6];
        for (int i= 0, j = 0, k = 0; i <= 10; i++) {
            // 1. 2의 배수
            if (i % 2 == 0) {
                two[j] = i;
                j++;
            }
            // 2. 3의 배수
            else {
                three[k] = i;
                k++;
            }
        }
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(three));
        // 3. 1과 2의 숫자들의 총합
        int sum = 0;
        for (int i = 0; i < two.length; i++) {
            sum = sum + two[i];
        }
        for (int i = 0; i < three.length; i++) {
            sum = sum + three[i];
        }
        System.out.println(sum);
            // 4. 그 숫자들의 총 합이 짝수인지 홀수 인지
        if (sum % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
