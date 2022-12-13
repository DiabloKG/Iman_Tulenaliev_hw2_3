public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException limitException) {
                bankAccount.withDraw((int) bankAccount.getAmount());
                System.out.println(bankAccount.getAmount());
                break;
            }
        }
    }

}