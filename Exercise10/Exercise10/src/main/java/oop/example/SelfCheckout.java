package oop.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */

public class SelfCheckout {
    public static void main(String[] args) {
        double quantity;
        double priceofitem;
        double tax = 0, subtotal = 0, total = 0;
        Scanner scnr = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter the price of item " + i +" : $" );
            priceofitem = scnr.nextInt();
            System.out.print("Enter the quantity of item " + i +": ");
            quantity = scnr.nextInt();

            subtotal += (priceofitem * quantity);

        }
        String strSubtotal = String.format("%.2f", subtotal);
        System.out.println("Subtotal: $" + strSubtotal);
        tax = (subtotal*.055);
        String strTax = String.format("%.2f", tax);
        System.out.println("Tax: $" + strTax);
        total = (subtotal+tax);
        String strTotal = String.format("%.2f", total);
        System.out.println("Total: $" + strTotal);
    }
}
