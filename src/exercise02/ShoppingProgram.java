package exercise02;

import java.util.Scanner;

public class ShoppingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Shopping Program ==========");
        
        // Input number of bills
        System.out.print("Input number of bills: ");
        int numberOfBills = scanner.nextInt();
        
        // Input bill values
        int[] bills = new int[numberOfBills];
        for (int i = 0; i < numberOfBills; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            bills[i] = scanner.nextInt();
        }
        
        // Input person wallet
        System.out.print("Input value of wallet: ");
        int walletValue = scanner.nextInt();
        
        // Create Person object
        Person person = new Person(walletValue);

        // Calculate total bill
        int totalBill = calcTotal(bills);
        System.out.println("This is total of bills: " + totalBill);

        // Determine if the person can buy it
        if (person.getWallet().payMoney(totalBill)) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }

        scanner.close();
    }

    public static int calcTotal(int[] bills) {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }
}