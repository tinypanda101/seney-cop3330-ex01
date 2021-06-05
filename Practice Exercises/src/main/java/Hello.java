/*
    UCF COP3330 Summer 2021 Assignment 1 Solution
    Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = scanner.nextLine();

        String greeting = "Hello, " + name + ", nice to meet you!";

        System.out.println(greeting);

    }



}
