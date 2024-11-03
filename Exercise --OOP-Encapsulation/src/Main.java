import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount  ;
        int choice ;

        System.out.println("Testing Account Class");
        System.out.println("---------------------");

        Account account = new Account();

        account.setName("Sara Mohammed");
        account.setId("1122875102");
        account.setBalance(10000);



        //Creating another account
        Account another = new Account("110938756","Fahd",1500);


        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Account Info");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Transfer Amount");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Account Information : ");
                    System.out.println("-------------------");

                    System.out.println("Name: "+ account.getName());
                    System.out.println("ID Number: " + account.getId());
                    System.out.println("Current Account Balance: " + account.getBalance() + " SAR");
                    break;
                case 2:
                    System.out.print("Enter amount to credit: ");
                    amount = input.nextInt();
                    if (amount > 0) {
                        account.credit(amount);
                        System.out.println("New Balance after credit: " + account.getBalance() + " SAR");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to debit: ");
                    amount = input.nextInt();
                    if (amount > 0) {
                        int previousBalance = account.getBalance(); // Store the balance before the debit
                        account.debit(amount);

                        // Check if the balance has changed; if not, it means the debit failed
                        if (account.getBalance() == previousBalance) {
                            System.out.println("Debit failed. Insufficient balance.");
                        } else {
                            System.out.println("New Balance after debit: " + account.getBalance() + " SAR");
                        }
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                case 4:
                    System.out.print("Enter amount to transfer: ");
                    amount = input.nextInt();
                    if (amount > 0) {
                        if (account.transferTo(another, amount)) {
                            System.out.println("Transfer successful!");
                        } else {
                            System.out.println("Transfer failed. Check amount and balance.");
                        }
                        System.out.println("Another Account Balance: " + another.getBalance() + " SAR");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");

            }

        }while (choice != 5);



    }
}