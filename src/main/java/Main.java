
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        home_screen();

    }


    public static void home_screen() {
        boolean option = true;

        while (option) {
            try {
                System.out.println("""
                        |Please choose a Option|
                        D) Add Deposit
                        P) Make Payment (Debit)
                        L) Ledger
                        X) Exit
                        """);
                System.out.print("Enter:");
                //choose an option and auto go to uppercase
                String choice = scanner.nextLine().toUpperCase();
                //checks the variable "choice" to see if it matches any of the case values
                switch(choice){
                    case "D":
                        add_deposit();
                        break;
                    case "P":
                        make_payment();
                        break;
                    case "L":
                        ledger();
                        break;
                    case "X":
                        exit();
                        option = false;
                        break;
                    default:
                        System.out.println("!!Input Not Available!!"+"\n");
                        break;
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("!!exception!!");

            }
        }
    }

    public static void add_deposit(){
        System.out.println("\n");
        System.out.print("How much are you depositing:");
        double amount = scanner.nextDouble();

        try {
            FileWriter deposit_file = new FileWriter("deposit_file");
            deposit_file.write("");
        } catch (IOException e) {
            System.out.println("Exception warning");
        }

    }

    public static void make_payment(){

    }

    public static void ledger(){

    }

    public static void exit(){
      System.out.println("Thanks trying the app \uD83D\uDE3C");
  }
























}

