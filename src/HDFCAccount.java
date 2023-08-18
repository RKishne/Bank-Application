import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;

    private String accountNumber= String.valueOf(UUID.randomUUID());

    private String password;

    private int amount;


    private int year;

    final double RateOfInterest=  6.8;

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    final String IFSCode= "HDFC786934";

    public HDFCAccount() {
    }

    public HDFCAccount(String name, String accountNumber, int amount, int year) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.year = year;
    }

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

    public String getIFSCode() {
        return IFSCode;
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
            this.amount-=amount;
            return "After withdrawing Money ,your balance is:-"+this.amount;
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
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", year=" + year +
                ", RateOfInterest=" + RateOfInterest +
                ", IFSCode='" + IFSCode + '\'' +
                '}';
    }
}
