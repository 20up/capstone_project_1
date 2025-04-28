
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

    static FileWriter transaction;

    static {
        try {
            transaction = new FileWriter("transaction.csv", true);
        } catch (IOException e) {
            System.out.println("Exception warning A");
        }
    }

    public static void main(String[] args) {
        home_screen();
    }

    public static void home_screen() {
        boolean option = true;

        while (option) {
            try {
                System.out.println("\n" + "         |Home|");
                System.out.println("""
                        |Please choose a Option|
                        D) Add Deposit
                        P) Make Payment (Debit)
                        L) Ledger
                        X) Exit
                        """);
                System.out.print("Enter:");
                String choice = scanner.nextLine().toUpperCase();
                switch (choice) {
                    case "D":
                        add_deposit();
                        System.out.println("Deposit Successful" + "\n");
                        break;
                    case "P":
                        make_payments();
                        System.out.println("card information saved" + "\n");
                        break;
                    case "L":
                        Ledger.ledger();
                        break;
                    case "X":
                        exit();
                        option = false;
                        break;
                    default:
                        System.out.println("!!!!INPUT NOT AVAILABLE!!!!" + "\n");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("!!NOT A NUMBER!!");

            }
        }
    }

    public static void add_deposit() {
        boolean D = true;
        while (D) {
            System.out.println("\n");
            System.out.println("Please enter a description, vendor, and amount for you deposit.");
            System.out.print("Description:");
            String ad_description = scanner.nextLine();
            System.out.print("Vendor:");
            String ad_vendor = scanner.nextLine();
            System.out.print("Deposit Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            try {
                transaction.write(LocalDate.now() + " | " + LocalTime.now().format(dtf1) + " | " + ad_description + " | " + ad_vendor + " | $" + amount + "\n");
                transaction.close();
                D = false;
            } catch (IOException e) {
                scanner.nextLine();
                System.out.println("Exception warning d");
            }
        }
    }

    public static void make_payments() {
        boolean mp = true;
        //this is a loop for the credit/debit information 
        while (mp) {
            try {
                System.out.println("Please enter debit information to make payment");
                System.out.print("Debit/Credit #:");
                String card_number = scanner.nextLine();
                if (card_number.length() == 16) {
                    System.out.print("expiration date:");
                    String card_date = scanner.nextLine();//need to make a convert string to date
                    System.out.print("card cvv:");
                    int cvv = scanner.nextInt();
                    scanner.nextLine();
                } else
                    System.out.println("not a valid card number");

            } catch (Exception e) {
                System.out.println("wong");
            }

            try {
                transaction.write("");
            } catch (IOException e) {
                System.out.println("!!exception!! mp");
            }
        }
    }

    public static void exit() {
        System.out.println("Thanks trying the app \uD83D\uDE3C");
    }


}

