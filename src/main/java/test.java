//

public class test {
    public static void main(String[] args) {
        Home.home_screen();
    }
}

//payment
//        boolean p = true;
//
//        while (p) {
//            System.out.println("\n");
//            System.out.println("Please enter a description, vendor, and payment amount.");
//            System.out.print("Description:");
//            String mp_description = scanner.nextLine();
//            System.out.print("Vendor:");
//            String mp_vendor = scanner.nextLine();
//            System.out.print("Payment Amount:");
//            double payment = (-1 * scanner.nextDouble());
//            scanner.nextLine();
//            try {
//                FileWriter payment_file = new FileWriter("transaction.csv", true);
//                payment_file.write(LocalDate.now() + " | " + LocalTime.now().format(dtf1) + " | " + mp_description + " | " + mp_vendor + " | $" + payment + "\n");
//                payment_file.close();
//                p = false;
//            } catch (IOException e) {
//                System.out.println("Exception warning p");
//            }
//
//
//        }
//
//
//
//
//
//    }


  //debit info
//    boolean mp = true;
//    //this is a loop for the credit/debit information
//        while (mp) {
//        try {
//            System.out.println("Please enter debit information to make payment");
//            System.out.print("Debit/Credit #:");
//            String card_number = scanner.nextLine();
//            if (card_number.length() == 16) {
//                System.out.print("expiration date:");
//                String card_date = scanner.nextLine();//need to make a convert string to date
//                System.out.print("card cvv:");
//                int cvv = scanner.nextInt();
//                scanner.nextLine();
//            } else
//                System.out.println("not a valid card number");
//
//        } catch (Exception e) {
//            System.out.println("wong");
//        }
//
//        try {
//            transaction.write("");
//        } catch (IOException e) {
//            System.out.println("!!exception!! mp");
//        }
//    }
//}


//(LocalDate.now() + " | " + LocalTime.now().format(dtf1) + " | " + ad_description + " | " + ad_vendor + " | $" + amount + "\n");