class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}class InvalidDepositException extends Exception {
    public InvalidDepositException(String message) {
        super(message);
    }
}
public class main{
    private String acc_name;
    private double acc_balance;
    public main
