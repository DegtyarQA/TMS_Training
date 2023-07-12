package Lesson4;

public class CardProgram {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard();
        card1.account_number = "AT483200000012345864";
        card1.balance = 5;
        card1.BalanceUp(21);
        card1.CardInfo();

    }
}
