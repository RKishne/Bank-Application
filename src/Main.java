import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        HDFCAccount rahul=new HDFCAccount();
        rahul.setName("Rahul kishne");
        rahul.setAmount(20000);
        rahul.setYear(6);
        rahul.setPassword("Rahul123");
        //fetch all details of account
        System.out.println(rahul);

        //fetch current balance
        System.out.println(rahul.fetchBalance("random"));//incorrect password.
        System.out.println(rahul.fetchBalance("Rahul123"));//correct password.

        //add money to account
        System.out.println(rahul.addMoney(2000));

        //withdraw money to the account
        System.out.println(rahul.withdrawMoney(50000,"random"));//incorrect password.
        System.out.println(rahul.withdrawMoney(49000,"Rahul123"));//correct password.
        System.out.println(rahul.withdrawMoney(5000,"Rahul123"));//withdraw amount is less than amount

        //rate of interest
        System.out.println(rahul.rateOfInterest(7));

        //update password
        System.out.println(rahul.updatePassword("random","Rahul"));//incorrect password.
        System.out.println(rahul.updatePassword("Rahul123","Rahul"));//correct password.

        //fetch balance
        System.out.println(rahul.fetchBalance("Rahul"));

        SBIAccount rohit=new SBIAccount();
        rohit.setName("Rohit kishne");
        rohit.setAmount(50000);
        rohit.setPassword("Rohit123");
        rohit.setYear(6);

        //fetch all details of account
        System.out.println(rohit);

        //fetch current balance
        System.out.println(rohit.fetchBalance("random"));//incorrect password.
        System.out.println(rohit.fetchBalance("Rohit123"));//correct password.

        //add money to account
        System.out.println(rohit.addMoney(2000));

        //withdraw money to the account
        System.out.println(rohit.withdrawMoney(50000,"random"));//incorrect password.
        System.out.println(rohit.withdrawMoney(49000,"Rohit123"));//correct password.
        System.out.println(rohit.withdrawMoney(1500,"Rohit123"));//withdraw amount is less than amount
        System.out.println(rohit.withdrawMoney(500,"Rohit123"));

        //rate of interest
        System.out.println(rohit.rateOfInterest(7));

        //update password
        System.out.println(rohit.updatePassword("random","Rahul"));//incorrect password.
        System.out.println(rohit.updatePassword("Rohit123","Rohit"));//correct password.

        //fetch balance
        System.out.println(rohit.fetchBalance("Rohit"));
    }
}