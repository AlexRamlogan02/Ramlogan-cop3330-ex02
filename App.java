package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
       //create a program that takes an input and counts the characters
        Scanner scan = new Scanner(System.in);
        String input, output;
        int inputLength;
        System.out.print("What is your input? : ");
        input = scan.next();
        inputLength = input.length(); //this finds the length of the string
        output = input + " has " +inputLength +" characters"; //makes the output string
        System.out.println(output);
    }
}
