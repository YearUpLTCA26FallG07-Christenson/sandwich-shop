package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final double basePriceRegular = 5.45;
        final double basePriceLarge = 8.95;

        final float discountStudentPercent = 0.10f;
        final float discountSeniorPercent = 0.20f;

//        System.out.println("Welcome please choose your options:");
//        System.out.println("Sandwich sizes:");
//        System.out.println("  1: Regular ( $5.45 )");
//        System.out.println("  2: Large ( $8.95 )");
//        System.out.print("Please select your size (1/2): ");


        //prompt for size:
        String sizePrompt = """
                Welcome please choose your options
                   1: Regular ( $ 5.45 )
                   2: Large ( $8.95 )
                   Please select your size (1/2):""";
        System.out.print(sizePrompt);
        String sizeOption = scanner.nextLine();

        //prompt for age:
        System.out.println("What is your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        double currentBasePrice = 0;
        String currentSize = "";

        if(sizeOption.equalsIgnoreCase("1")){
            currentBasePrice = basePriceRegular;
            currentSize = "Regular";
        }
        else if(sizeOption.equalsIgnoreCase("2")){
            currentBasePrice = basePriceLarge;
            currentSize = "Large";
        }

        float currentDiscountPercent;

        if(age <= 17){
            currentDiscountPercent = discountStudentPercent;
        }
        else if (age >= 65) {
            currentDiscountPercent = discountSeniorPercent;
        }
        else {
            currentDiscountPercent = 0;
        }

        double price = currentBasePrice * ( 1 - currentDiscountPercent);

        System.out.printf("You are purchase a %s sandwich for a price of %.2f", currentSize, price);

    }
}
