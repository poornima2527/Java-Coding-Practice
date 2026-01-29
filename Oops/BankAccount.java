class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 100000; 
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "Aishwarya");
        BankAccount account2 = new BankAccount("987654321", "Poornima");

        account1.displayDetails();
        account2.displayDetails();
    }
}
