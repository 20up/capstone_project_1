
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
                        System.out.println("Deposit Successful" + "\n");
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
                        System.out.println("!!!!INPUT NOT AVAILABLE!!!!" + "\n");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("!!NOT A NUMBER!!");

            }
        }
    }

    public static void add_deposit(){
        boolean D = true;

        while(D) {
            System.out.println("\n");
            System.out.print("Deposit Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            try {
                FileWriter deposit_file = new FileWriter("deposit_file", true);

                deposit_file.write("Deposit: " + amount + "\n");
                deposit_file.close();
                D = false;
            } catch (IOException e) {
                scanner.nextLine();
                System.out.println("Exception warning d");
            }
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

