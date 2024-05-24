package StudyGroup.Study0523;

import java.util.Scanner;

/*
[은행어플]
1. 내 통장 잔고를 확인하는 메서드 구현
2. 출금 요청이 왔을때 출금하는 메서드 구현
3. 입금 요청이 왔을때 입금하는 메서드 구현
4. 송금 요청이 왔을때 송금하는 메서드 구현
*/
public class HW01 {
    public static void main(String[] args) {
        int myMoney = 1000;
        int youMoney = 5000;

        Bank bank = new Bank();
        //3번 메서드 실행 -> 5000원 입금해주세요.
        myMoney = bank.deposit(myMoney);
        //1번 메서드 실행
        int result1 = bank.checkMyAccount(myMoney);
        //2번 메서드 실행 -> 3000원 출금해주세요.
        myMoney = bank.withdraw(myMoney);
        //1번 메서드 실행
        result1 = bank.checkMyAccount(myMoney);
        //4번 메서드 실행 -> 1500원 송금해주세요.
        myMoney = bank.sendMoney(myMoney);
        //1번 메서드 실행
        result1 = bank.checkMyAccount(myMoney);
        System.out.println("잔고"+result1);

    }
}
