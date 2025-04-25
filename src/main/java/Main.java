package src.main.java;

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
                        Please choose a Option.
                        D) Add Deposit
                        P) Make Payment (Debit)
                        L) Ledger
                        X) Exit
                        """);
                System.out.print("Enter:");
                //choose an option and auto go to uppercase
                String choice = scanner.nextLine().toUpperCase();

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
                        System.out.println("thanks for coming");
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

    }

    public static void make_payment(){

    }

    public static void ledger(){

    }

    public static void  exit(){

    }
























}

