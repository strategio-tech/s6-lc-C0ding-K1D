package tech.strategio;

import java.math.BigDecimal;
import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * This method returns the remaining amount after three months of payments.
     * In the case where the amount is equal to 0 I inserted an if check to return 0 as there is no loan to calculate
     * I then created a balance variable to hold the updated balance through out the for loop.
     * Inside of the for loop I created a payment variable by dividing the total balance by the payment percentage
     * and then updated the balance by subtracting the payment and returning the balance once the loop is terminated.
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        if(amount == 0) {
            return 0;
        }
            int balance = amount;
            int percent = 10;

        for (int i = 0; i < 3; i++) {
            int payment = balance / percent;
            balance = balance - payment;
        }

        return balance;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
