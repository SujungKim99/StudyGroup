package StudyGroup.Study0523;

import java.util.Scanner;

public class Bank {
    //내 통장 잔고를 확인하는 메서드
    public int checkMyAccount(int myAccount) {
        return myAccount;
    }
    //출금 요청이 왔을때 출금하는 메서드
    public int withdraw(int myAccount) {
        Scanner scanner = new Scanner(System.in);
        int minMoney = scanner.nextInt();
        myAccount = myAccount - minMoney;
        return myAccount;
    }
    //입금 요청이 왔을때 입금하는 메서드
    public int deposit(int myAccount) {
        Scanner scanner = new Scanner(System.in);
        int plusMoney = scanner.nextInt();
        myAccount = myAccount + plusMoney;
        return myAccount;
    }
    //송금 요청이 왔을때 송금하는 메서드
    public int sendMoney(int myAccount) {
        Scanner scanner = new Scanner(System.in);
        int howMoney = scanner.nextInt();
        myAccount = myAccount - howMoney;
        return myAccount;
    }
}
