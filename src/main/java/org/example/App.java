/*
 * UCF COP3330 Fall 2021 Assignment 11 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "How many euros are you exchanging?" );
        Double euros = input.nextDouble();
        System.out.println( "What is the exchange rate?" );
        Double exchangeRate = input.nextDouble();

        double c_to = 0;

        if (((euros * exchangeRate) - Math.floor(euros * exchangeRate)) >= 0.5)
            c_to = (Math.ceil(100 * euros * exchangeRate)) / 100;
        else
            c_to = (Math.floor(100 * euros * exchangeRate)) / 100;

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate +
                " is " + c_to + " U.S. dollars.");
    }
}
