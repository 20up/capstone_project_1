import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Report {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void reporter() {
        boolean option_2 = true;

        while (option_2) {
            try {
                System.out.println("\n" + "       |Report|");
                System.out.println("""
                        |Please choose a Option|
                        1) Month To Date
                        2) Previous Month
                        3) Year To Date
                        4) Previous Year
                        5) Search by Vendor
                        0) Back
                        """);
                System.out.print("Enter:");
                String choice_2 = scanner.nextLine().toUpperCase();
                switch (choice_2) {
                    case "1":
                        month_to_date();
                        break;
                    case "2":
                        previous_month();
                        break;
                    case "3":
                        year_to_date();
                        break;
                    case "4":
                        previous_year();
                        break;
                    case "5":
                        search_by_vendor();
                        break;
                    case"0":
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

    public static void month_to_date(){}

    public static void previous_month(){}

    public static void year_to_date(){}

    public static void previous_year(){}

    public static void search_by_vendor(){}

    public static void back(){
        Ledger.ledger();
    }




}

