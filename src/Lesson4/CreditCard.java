package Lesson4;

import java.util.Random;

public class CreditCard {

    String account_number;
    float balance;

    CreditCard(float balance) {
        balance = balance;
        account_number = "AKZ11110000000000000";
    }

    CreditCard() {

    }

    float BalanceUp(float cashin) {
        balance = balance + cashin;
        return balance;
    }

    void BalanceDown(float expenses) {
        balance = balance - expenses;
        //return balance;
    }

    void CardInfo() {
        System.out.println("Balance card " + account_number + " is : " + balance);
    }
}
