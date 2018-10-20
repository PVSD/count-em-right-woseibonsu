package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, sp[];
        while (true) {
            System.out.print("Please type a sentence and press Enter.\nPress Exit to leave.\n");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("EXIT")) {
              break;
            }
            input = input + "Z";
            input = input.toUpperCase();

            sp = input.split("(S\\s*A)");

            System.out.println("There are " + (sp.length - 1) + " occurrences.\n");


        }
    }
}