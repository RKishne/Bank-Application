import java.util.UUID;

public class SBIAccount implements BankAccountInterface{

    private String name;

    private String accountNumber= String.valueOf(UUID.randomUUID());

    private String password;

    private int amount;

    private int year;

    final double RateOfInterest=  7.5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRateOfInterest() {
        return RateOfInterest;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password==password) {
            return "your Current Balance is:-"+this.amount;
        }
        return "Incorrect Password !!!";
    }

    @Override
    public String addMoney(int amount) {
        this.amount=this.amount+amount;
        return "Your's new Balance is After deposite Money :-"+ this.amount;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        if(this.password==password){
            if(amount>this.amount){
                return "Insufficient Money in your Account.";
            }
            if(amount<this.amount){
                int remainingamount=this.amount-amount;
                if(remainingamount>=1000) {
                    this.amount=this.amount-amount;
                    return "After withdrawing Money ,your balance is:-" + this.amount;
                }
                return "After withdrawing remaining amount is lees than required minimum account balnace";
            }

            return "insufficient balance in ur account";

        }
        return "Incorrect password!!!";
    }

    @Override
    public String rateOfInterest(int year) {
        return "Rate of interst :-"+((amount*RateOfInterest*year)/100.0);
    }

    @Override
    public String updatePassword(String oldpassword, String newpassword) {
        if(oldpassword==this.password){
            this.password=newpassword;
            return "Password Update Successfully";
        }
        return "Incorrect oldpassword!!";
    }

    @Override
    public String toString() {
        return "SBIAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", year=" + year +
                ", RateOfInterest=" + RateOfInterest +
                '}';
    }
}
