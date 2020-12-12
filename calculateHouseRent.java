package com.burak;

import java.util.Scanner;

public class calculateHouseRent {
    public static void main(String[] args) {
        System.out.print("Please enter a Member :");
        int member = new Scanner(System.in).nextInt();

        System.out.print("Please enter a rent of house :");
        int rent = new Scanner(System.in).nextInt();

        int sum=0;
        int i;
        int j;
        System.out.print("Please enter a number a bill :");
        int bill = new Scanner(System.in).nextInt();
        for (i=1;i<=bill;i++){
            System.out.print("Please enter a price of "+i+". bill : ");
            int price = new Scanner(System.in).nextInt();
            sum=sum+price;
        }
        sum=sum+rent;
        System.out.println("The sum of all expense is : "+sum);
        double perPerson = sum/member;
        System.out.printf("Rent per person is : %f ",perPerson,"\n");
        System.out.println("Please don't be late!");
    }
}
