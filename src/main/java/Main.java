package src.main.java;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        home_screen();

    }



    public static void home_screen(){
        boolean option = true;
        try{
            System.out.println("""
                D) Add Deposit
                P) Make Payment (Debit)
                L) Ledger
                X) Exit
                """);
            System.out.print("Enter:");
            String choice = scanner.nextLine();
        }catch (Exception e){
            scanner.nextLine();
            System.out.println("!!Input Not Available!!");
        }


    }
}

