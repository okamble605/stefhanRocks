import java.util.*;

public class ATM {
  private double balance;

  public ATM(double balance) {
    this.balance = balance;
  }

  public void checkBalance() {
    System.out.println("Your balance is: " + balance);
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds");
    } else {
      balance -= amount;
      System.out.println("You have withdrawn: " + amount);
      System.out.println("Your new balance is: " + balance);
    }
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("You have deposited: " + amount);
    System.out.println("Your new balance is: " + balance);
  }

  public void transfer(ATM recipient, double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds");
    } else {
      balance -= amount;
      recipient.balance += amount;
      System.out.println("You have transferred: " + amount + " to " + recipient);
      System.out.println("Your new balance is: " + balance);
    }
  }

  public static void main(String[] args) {
    ATM atm = new ATM(1000);
    Scanner scanner = new Scanner(System.in);
    int choice;
    double amount;
    ATM recipient;

    while (true) {
      System.out.println("ATM Menu:");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Transfer");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          atm.checkBalance();
          break;
        case 2:
          System.out.print("Enter amount to withdraw: ");
          amount = scanner.nextDouble();
          atm.withdraw(amount);
          break;
        case 3:
          System.out.print("Enter amount to deposit: ");
          amount = scanner.nextDouble();
          atm.deposit(amount);
          break;
        case 4:
          System.out.print("Enter recipient: ");
          //recipient = scanner.nextInt();
          System.out.print("Enter amount to transfer: ");
          amount = scanner.nextDouble();
         // atm.transfer(recipient, amount);
          break;
        case 5:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}
