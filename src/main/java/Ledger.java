import java.io.*;
import java.util.Scanner;

public class Ledger {
    static Scanner scanner = new Scanner(System.in);

    public static void ledger() {
        boolean option_2 = true;

        while (option_2) {
            try {
                System.out.println("\n" + "       |Ledger|");
                System.out.println("""
                        |Please choose a Option|
                        A) All
                        D) Deposits
                        P) Payments
                        R) Reports
                        0) Back
                        """);
                System.out.print("Enter:");
                String choice_2 = scanner.nextLine().toUpperCase().trim();
                switch (choice_2) {
                    case "A":
                        System.out.println("|All Entries as Followed|" + "\n");
                        all();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "D":
                        System.out.println("|All Deposits as Followed|" + "\n");
                        deposits();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "P":
                        System.out.println("|All Payments as Followed|" + "\n");
                        payment();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "R":
                        reports();
                        option_2 = false;
                        break;
                    case "0":
                        back();
                        option_2 = false;
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

    public static void all() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"));
            String all;
            while ((all = reader.readLine()) != null) {
                System.out.println(all);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("ran into problem");
        }
    }

    public static void deposits() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"));
            String positive;
            while ((positive = reader.readLine()) != null) {
                String[] ad = positive.split("\\$");
                double amount = Double.parseDouble(ad[1].trim());
                if (amount > 0) {
                    System.out.println(positive);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("ran into problem");
        }
    }

    public static void payment() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"));
            String negative;
            while ((negative = reader.readLine()) != null) {
                String[] mp = negative.split("\\$");
                double amount = Double.parseDouble(mp[1].trim());
                if (amount < 0) {
                    System.out.println(negative);
                }
            }
        } catch (IOException e) {
            System.out.println("ran into problem");
        }
    }

    public static void reports() {
        Report.reporter();
    }

    public static void back() {
        Home.home_screen();
    }
}
