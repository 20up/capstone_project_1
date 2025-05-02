
import java.time.LocalDate;
import java.util.*;


public class Report {
    static Scanner scanner = new Scanner(System.in);

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
                String choice_2 = scanner.nextLine().trim();
                switch (choice_2) {
                    case "1":
                        System.out.println("|Month to Date as Followed|" + "\n");
                        month_to_date();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "2":
                        System.out.println("|Previous Month as Followed|" + "\n");
                        previous_month();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "3":
                        System.out.println("|Year to Date as Followed|" + "\n");
                        year_to_date();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "4":
                        System.out.println("|Previous Year as Followed|" + "\n");
                        previous_year();
                        System.out.println("|No More Entries|" + "\n");
                        break;
                    case "5":
                        search_by_vendor();
                        System.out.println("|No More Entries|" + "\n");
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
        scanner.close();

    }

    public static void month_to_date() {
        try {
            List<String> file = Cvs_reader.read_transaction_file("transaction.csv");

            LocalDate today = LocalDate.now();
            LocalDate first_day = today.withDayOfMonth(1);

            for (String line_text : file) {
                String[] parts = line_text.split("\\|");

                if (parts.length >= 2) {
                    LocalDate date = LocalDate.parse(parts[0].trim());

                    if (!date.isBefore(first_day) && !date.isAfter(today)) {
                        System.out.println(line_text);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("!!EXCEPTION!! 1");
        }
    }


    public static void previous_month() {
        try {
            List<String> file = Cvs_reader.read_transaction_file("transaction.csv");

            LocalDate today = LocalDate.now();
            LocalDate first_day_lm = today.minusMonths(1).withDayOfMonth(1);
            LocalDate last_day_lm = today.minusMonths(1).withDayOfMonth(today.minusMonths(1).lengthOfMonth());

            for (String line_text : file) {
                String[] parts = line_text.split("\\|");

                if (parts.length >= 2) {
                    LocalDate date = LocalDate.parse(parts[0].trim());

                    if (!date.isBefore(first_day_lm) && !date.isAfter(last_day_lm)) {
                        System.out.println(line_text);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("!!EXCEPTION!! 2");
        }
    }

    public static void year_to_date() {
        try {
            List<String> file = Cvs_reader.read_transaction_file("transaction.csv");

            LocalDate today = LocalDate.now();
            LocalDate first_day_ty = today.withDayOfYear(1);

            for (String line_text : file) {
                String[] part = line_text.split("\\|");

                if (part.length >= 2) {
                    LocalDate date = LocalDate.parse(part[0].trim());

                    if (!date.isBefore(first_day_ty) && !date.isAfter(today)) {
                        System.out.println(line_text);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("!!EXCEPTION!! 3");
        }
    }

    public static void previous_year() {
        try {
            List<String> file = Cvs_reader.read_transaction_file("transaction.csv");

            LocalDate today = LocalDate.now();
            LocalDate first_day_ly = today.minusYears(1).withDayOfYear(1);
            LocalDate last_day_ly = today.minusYears(1).withDayOfYear(today.minusYears(1).lengthOfYear());

            for (String line_text : file) {
                String[] part = line_text.split("\\|");

                if (part.length >= 2) {
                    LocalDate date = LocalDate.parse(part[0].trim());

                    if (!date.isBefore(first_day_ly) && !date.isAfter(last_day_ly)) {
                        System.out.println(line_text);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("!!EXCEPTION!! 4");
        }
    }

    public static void search_by_vendor() {
        try {
            System.out.println("\nSearch by Vendor");
            System.out.print("Vendor:");
            String vendor = scanner.nextLine().trim();

            List<String> file = Cvs_reader.read_transaction_file("transaction.csv");

            System.out.println("\n|Search Vendor as Followed|\n");

            for (String line_text : file) {
                String[] part = line_text.split("\\|");

                if (part.length >= 2) {
                    String the_vendor = part[3].trim();

                    if (vendor.equalsIgnoreCase(the_vendor)) {
                        System.out.println(line_text);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("!!EXCEPTION!! 5");
        }
    }

    public static void back() {
        Ledger.ledger();
    }


}

