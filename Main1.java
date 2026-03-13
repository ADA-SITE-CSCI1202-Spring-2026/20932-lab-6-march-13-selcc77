public class Main1 {

    public static void main(String[] args) {

        Account acc = new Account(101, "Selcan", 500);

        acc.deposit(200);

        try {
            acc.withdraw(800);
        }
        catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Balance: " + acc.getBalance());
    }
}