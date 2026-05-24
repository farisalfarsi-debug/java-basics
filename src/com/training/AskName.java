package com.training;

import java.util.ArrayList;
import java.util.Scanner;

public class AskName { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Ask how many names to enter
        System.out.print("How many names do you want to enter? ");
        int count = Integer.parseInt(sc.nextLine());

        // Take names from user
        for (int i = 0; i < count; i++) {

            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();

            names.add(name);
        }

        // Success message
        System.out.println("Names saved successfully.");

        // Search for a name
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        // Check if name exists
        if (names.contains(searchName)) {

            System.out.println("Name found");

        } else {

            System.out.println("Name not found");
        }

        sc.close();
    }
}