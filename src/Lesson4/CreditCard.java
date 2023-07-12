package Lesson4;

public class CreditCard {

    String account_number;
    float balance;

    float BalanceUp (float cashin) {
       balance = balance + cashin;
       return balance;
    }
    float  BalanceDown (float expenses) {
        balance = balance - expenses;
        return balance;
    }
    void CardInfo() {
        System.out.println(account_number);
        System.out.println(balance);
    }
}
