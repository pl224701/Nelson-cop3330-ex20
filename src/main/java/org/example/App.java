/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String str1 = sc.nextLine();
        System.out.print("What state do you live in? ");
        String str2 = sc.nextLine();
        System.out.print("What county do you live in? ");
        String str3 = sc.nextLine();
        Double tax_rate;
        Double subtotal=Double.parseDouble(str1);
        Double tax;
        Double total;

        if(str2.equals("Illinois"))
        {
            tax_rate = 0.08;
            tax = tax_rate*subtotal;
            total=tax+subtotal;
        }
        else if(str2.equals("Wisconsin"))
        {
            if(str3.equals("Eau Claire"))
            {
                tax_rate = 0.055;
                tax = tax_rate*subtotal;
                total=tax+subtotal;
            }
            else if(str3.equals("Dunn"))
            {
                tax_rate = 0.054;
                tax = tax_rate*subtotal;
                total=tax+subtotal;
            }
            else
            {
                tax_rate = 0.05;
                tax = tax_rate*subtotal;
                total=tax+subtotal;
            }
        }
        else
        {
            tax=0.00;
            total=subtotal;
        }
        System.out.printf("The tax is $%.2f\nThe total is $%.2f",tax,total);
    }
}
