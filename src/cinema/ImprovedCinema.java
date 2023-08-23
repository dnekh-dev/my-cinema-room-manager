package cinema;

import java.util.Scanner;

public class ImprovedCinema {

    private static Scanner sc = new Scanner(System.in);
    private static char[][] cinemaSeats;

    public static void main(String[] args) {

        int numOfRows = getInput("Enter the number of rows:");
        int numOfSeats = getInput("Enter the number of seats in each row:");
        cinemaSeats = new char[numOfRows][numOfSeats];

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfSeats; j++) {
                cinemaSeats[i][j] = 'S';
            }
        }

        while (true) {
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printCinema(numOfRows, numOfSeats);
                    break;
                case 2:
                    buyTicket(numOfRows, numOfSeats);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getInput(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    private static void printCinema(int numOfRows, int numOfSeats) {
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 1; i <= numOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < numOfRows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < numOfSeats; j++) {
                System.out.print(cinemaSeats[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void buyTicket(int numOfRows, int numOfSeats) {
        int row = getInput("Enter a row number:") - 1;
        int seat = getInput("Enter a seat number in that row:") - 1;

        if (cinemaSeats[row][seat] == 'B') {
            System.out.println("Sorry, this seat is already taken!");
            return;
        }

        cinemaSeats[row][seat] = 'B';
        int price = calculatePrice(numOfRows, numOfSeats, row + 1);
        System.out.println("Ticket price: $" + price);
    }

    private static int calculatePrice(int numOfRows, int numOfSeats, int row) {
        int totalSeats = numOfRows * numOfSeats;
        if (totalSeats <= 60) {
            return 10;
        } else {
            return (row <= numOfRows / 2) ? 10 : 8;
        }
    }
}
