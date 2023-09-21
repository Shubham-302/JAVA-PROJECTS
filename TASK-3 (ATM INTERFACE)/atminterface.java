import java.util.Scanner;

class finacle {
    private double balance;

    public finacle(double initialBalance) {
        balance = initialBalance;
    }

    public double displayBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class solution {
    private finacle finacle;
    private Scanner scanner;

    public solution(finacle finacle) {
        this.finacle = finacle;
        scanner = new Scanner(System.in);
    }
    

    public void run() {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    withdrawAmount();
                    break;
                case 2:
                    depositAmount();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the solution system software");
                    return;
                default:
                    System.out.println("Wrong entry. Please try again.");
                    break;
            }
        }
    }

    private void displayMenu() {
        System.out.println("ATM solutions System Menu:");
        System.out.println("1. withdrawAmount");
        System.out.println("2. depositAmount");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit App");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void withdrawAmount() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Wrong entry. Please try again.");
            return;
        }

        if (amount > finacle.displayBalance()) {
            System.out.println("Insufficient balance. Please try again.");
            return;
        }

        finacle.withdraw(amount);
        System.out.println("Withdrawal of Rs." + amount + " successful.");
    }

    private void depositAmount() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Wrong amount. Please try again.");
            return;
        }

        finacle.depositAmount(amount);
        System.out.println("depositAmount of Rs." + amount + " successful.");
    }

    private void checkBalance() {
        double balance = finacle.displayBalance();
        System.out.println("Your current balance is: Rs." + balance);
    }
}

public class atminterface {
    public static void main(String[] args) {
        finacle finacle = new finacle(20000.0); 
        solution solution = new solution(finacle);
        solution.run();
    }
}