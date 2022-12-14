public class BankAccount {
    double amount;

    public double getAmount() {
        return this.amount;
    }

    public void deposit(double sum) {
        this.amount = this.amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (this.amount < sum) {
            throw new LimitException("Недостаточно средств для списания, будет списано: " + this.amount , this.amount);
        }
        this.amount = this.amount - sum;
    }
}

