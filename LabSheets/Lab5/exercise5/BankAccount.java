package Lab5.exercise5;

public class BankAccount {
    private String owner;
    private int number;

    private static int count = 0;
    private static double interestRate;

    public BankAccount(){
        setOwner("Owner not Available");
        setNumber();
        setInterestRate(0);
    }

    public BankAccount
            (
                String owner,
                double interestRate
            ){
        setOwner(owner);
        setNumber();
        setInterestRate(interestRate);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private void setNumber() {
        count++;
        this.number = count;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static int getCount() {
        return count;
    }

    public String getOwner() {
        return owner;
    }

    public int getMember() {
        return number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return String.format(
                "Owner: %s,  Account Number: %d,  Interest Rate: %.2f",
                this.owner, this.number, interestRate
        );
    }
}
