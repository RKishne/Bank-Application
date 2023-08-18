public interface BankAccountInterface {

    String fetchBalance(String password);

    String addMoney(int amount);

    String withdrawMoney(int amount,String password);

    String rateOfInterest(int year);

    String updatePassword(String oldpassword,String newpassword);

}
