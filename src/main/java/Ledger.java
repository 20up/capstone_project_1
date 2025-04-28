import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ledger {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

    static FileWriter transaction;

    static {
        try {
            transaction = new FileWriter("transaction.csv", true);
        } catch (IOException e) {
            System.out.println("Exception warning A");
            ;
        }
    }

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
                        H) Home        
                        """);
                System.out.print("Enter:");
                String choice_2 = scanner.nextLine().toUpperCase();
                switch (choice_2) {
                    case "A":
                        System.out.println("|All Entries as Followed|" + "\n");
                        all();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "D":
                        deposits();
                        System.out.println("card information saved" + "\n");
                        break;
                    case "P":
                        payment();
                        break;
                    case "R":
                        reports();
                        break;
                    case "H":
                        home();
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
    }

    public static void payment() {
    }

    public static void reports() {
    }

    public static void home() {
        Main.home_screen();
    }
}
