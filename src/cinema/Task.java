package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        /*String[] str = scanner.nextLine().split(" ");
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            temp = Integer.parseInt(str[i]) - 1;
            //str[i] = String.valueOf(temp);
            System.out.print(temp + " ");
        }*/

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        }
        System.out.println(result);*/

        /*int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number should be an odd");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == n - 2 || i == n / 2 || j == n - 2 || j == n / 2 || j == i || j == n - i - 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print(".  ");
                    }
                }
                System.out.println();
            }
        }*/

        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number should be an odd");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == n - 2 || i == n / 2 || j == n - 2 || j == n / 2 || j == i || j == n - i - 1)
                            && !(i == 7 && (j != 1 && j != 4 && j != 7))
                            && !(j == 7 && (i != 1 && i != 4 && i != 7))) {
                        System.out.print("* ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
        }
    }
}
