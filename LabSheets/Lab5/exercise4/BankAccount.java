package Lab5.exercise4;

public class BankAccount {
    private String owner;
    private int member;
    private static double interestRate;

    public BankAccount(){
        setOwner("Owner not Available.");
        setMember(0);
        setInterestRate(0);
    }

    public BankAccount
            (
                String owner,
                int member,
                double interestRate
            ){
        setOwner(owner);
        setMember(member);
        setInterestRate(interestRate);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String getOwner() {
        return owner;
    }

    public int getMember() {
        return member;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}
