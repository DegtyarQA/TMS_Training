package Lesson4;

import java.util.Scanner;

public class CardProgram {
    public static void main(String[] args) {
//Card1
        CreditCard card1 = new CreditCard();
        card1.account_number = "AT483200000012345864";
        card1.balance = 5;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Vvdefite summ popolnenya: ");
        float x = s1.nextFloat();
        card1.BalanceUp(x);
//Card1
        CreditCard card2 = new CreditCard();
        card2.balance = 65;
        card2.account_number = "RUS11110000000000";
        System.out.print("Vvdefite summ popolnenya: ");
        float y = s1.nextFloat();
        card2.BalanceUp(y);

//Card3
        CreditCard card3 = new CreditCard(25);
        System.out.print("Vvedite summ spisanya: ");
        float z = s1.nextFloat();
        card3.BalanceDown(z);

        card1.CardInfo();
        card2.CardInfo();
        card3.CardInfo();

    }
}
