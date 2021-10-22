package Lab4Q3;

public class Test {
    public static void main(String[] args) {

        SavingsAccount sever1 = new SavingsAccount(2000, 0.04); //sever1
        SavingsAccount sever2 = new SavingsAccount(3000, 0.04); //sever2

        //calculate the savingBalance for both
        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();

        //modify the InterestRate
        SavingsAccount.modifyInterestRate();

        //New balance and Savings
        sever1.calculateMonthlyInterest();
        sever2.calculateMonthlyInterest();

    }
}
