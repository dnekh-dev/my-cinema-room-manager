package cinema;

import java.util.Scanner;

public class Cinema {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numOfRows = getInput("Enter the number of rows:");
        int numOfSeats = getInput("Enter the number of seats in each row:");

        printCinema(numOfRows, numOfSeats, null, null);

        int row = getInput("Enter a row number:");
        int seat = getInput("Enter a seat number in that row:");

        int price = calculatePrice(numOfRows, numOfSeats, row);
        System.out.println("\nTicket price: $" + price + "\n");

        printCinema(numOfRows, numOfSeats, row, seat);
    }

    private static int getInput(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    private static void printCinema(int numOfRows, int numOfSeats, Integer selectedRow, Integer selectedSeat) {
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 1; i <= numOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= numOfRows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= numOfSeats; j++) {
                if (selectedRow != null && selectedSeat != null && i == selectedRow && j == selectedSeat) {
                    System.out.print('B' + " ");
                } else {
                    System.out.print('S' + " ");
                }
            }
            System.out.println();
        }
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
