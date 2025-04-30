
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Home {
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
                String choice = scanner.nextLine().toUpperCase().trim(); //wilmer showed me that ".trim" is more user-friendly.
                switch (choice) {
                    case "D":
                        add_deposit();
                        System.out.println("\nDeposit Successful\n");
                        break;
                    case "P":
                        make_payments();
                        System.out.println("\nPayment Successful\n");
                        break;
                    case "L":
                        Ledger.ledger();
                        option = false;
                        break;
                    case "X":
                        System.out.println("Thanks for trying the app \uD83D\uDE3C");
                        option = false;
                        break;
                    default:
                        System.out.println("!!!!INPUT NOT AVAILABLE!!!!" + "\n");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("!!EXCEPTION!!");
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
                transaction.write((LocalDate.now() + " | " + LocalTime.now().format(dtf1) + " | " + ad_description + " | " + ad_vendor + " | $" + amount + "\n"));
                transaction.close();
                D = false;
            } catch (IOException e) {
                scanner.nextLine();
                System.out.println("Exception warning d");
            }
        }
    }

    public static void make_payments() {
        boolean p = true;
        while (p) {
            System.out.println("\n");
            System.out.println("Please enter a description, vendor, and payment amount.");
            System.out.print("Description:");
            String mp_description = scanner.nextLine();
            System.out.print("Vendor:");
            String mp_vendor = scanner.nextLine();
            System.out.print("Payment Amount:");
            double payment = -Math.abs(scanner.nextDouble()); // Wilmer showed me "-math.abs" for making any number negative
            scanner.nextLine();

            try {
                transaction.write(LocalDate.now() + " | " + LocalTime.now().format(dtf1) + " | " + mp_description + " | " + mp_vendor + " | $" + payment + "\n");
                transaction.close();
                p = false;
            } catch (IOException e) {
                System.out.println("Exception warning p");
            }
        }
    }

}

