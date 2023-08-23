package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numOfRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeats = sc.nextInt();

        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= numOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= numOfSeats; j++) {
                System.out.print('S' + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Enter a row number:");
        int row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = sc.nextInt();

        int totalSeats = numOfRows * numOfSeats;
        int result = 0;

        if (totalSeats <= 60) {
            result = 10;
        } else {
            if (row <= numOfRows / 2) {
                result = 10;
            } else {
                result = 8;
            }
        }

        System.out.println();
        System.out.println("Ticket price: $" + result + "\n");

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= numOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= numOfSeats; j++) {
                if (i == row && j == seat) {
                    System.out.print('B' + " ");
                } else {
                    System.out.print('S' + " ");
                }
            }
            System.out.println();
        }

    }

    /*public static void initialOfSeats(int numberOfRows, int numberOfSeats) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numberOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= numberOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= numberOfSeats; j++) {
                System.out.print('S' + " ");
            }
            System.out.println();
        }
    }*/
}
