package Lab4Q3;

import java.util.Scanner;

public class SavingsAccount {
    private static double annualInterestRate; //no need for a getter, declared in PRIVATE
    private double savingsBalance;

    /**
     * Default constructor
     */
    public SavingsAccount(){
        this.savingsBalance = 0;
    }

    /**
     * A constructor for a balance
     *
     * @param sB  Default savingsBalance
     * @param aIR Default annualInterestRate
     */
    public SavingsAccount(double sB, double aIR) {
        this.savingsBalance = sB;
        annualInterestRate = aIR;

    }

    /**
     * Calculate the monthly interest
     * Added to savings-Balance
     */
    public void calculateMonthlyInterest() {
        double interest = this.getSavingsBalance() * (double) (annualInterestRate / 12);
        this.savingsBalance = this.getSavingsBalance() + interest;
        System.out.println("The new savingBalance is " + this.getSavingsBalance());
    }

    /**
     * Static method:
     * Modify the InterestRate to a new one
     */
    public static void modifyInterestRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the new InterestRate: ");
        double NewInterestRate = (double) sc.nextDouble(); //scan and input a double
        annualInterestRate = NewInterestRate;
        System.out.println("The interestRate has been updated: " + annualInterestRate);
    }

    /**
     * Get the account's savingsBalance
     * @return savingsBalance
     */
    public double getSavingsBalance() {
        return this.savingsBalance;
    }


}
