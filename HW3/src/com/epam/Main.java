package com.epam;
import java.util.Scanner;
public class Main {
    final private static int SIDE = 5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exit = 1;
        while (exit == 1) {
            System.out.print("Enter figure number (1,2,3,4 or 5): ");
            int figureNumber = in.nextInt();
            switch (figureNumber) {
                case 1:
                    drawFirstFigure();
                    break;
                case 2:
                    drawSecondFigure();
                    break;
                case 3:
                    drawThirdFigure();
                    break;
                case 4:
                    drawFourthFigure();
                    break;
                case 5:
                    drawFifthFigure();
                    break;
                default:
                    System.out.println("Wrong input. I'm begging you! Enter figure number (1,2,3,4 or 5).");
            }
            System.out.println("Do you want to continue? (1 - yes, another number - exit).");
            System.out.print("Enter: ");
            exit = in.nextInt();
            if (exit != 1) {
                exit = 0;
            }
        }
    }
    private static void drawFirstFigure() {
        for (int line = 1; line < SIDE; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int line = SIDE; line > 0; line--) {
            for (int column = 0; column < line; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void drawSecondFigure() {
        for (int line = SIDE; line > 0; line--) {
            for (int column = SIDE; (column-line) > 0; column--) {
                System.out.print("  ");
            }
            for (int column = 0; column < line; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void drawThirdFigure() {
        for (int line = SIDE; line > 0; line--) {
            for (int column = 1; column < line; column++) {
                System.out.print("  ");
            }
            for (int column = SIDE; (column-line) >= 0; column--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void drawFourthFigure() {
        for (int line = SIDE; line > 0; line--) {
            for (int column = 1; column <= line; column++) {
                System.out.print("  ");
            }
            for (int column = SIDE; (column-line) > 0; column--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int line = SIDE; line > 0; line--) {
            for (int column = SIDE; (column-line) > 0; column--) {
                System.out.print("  ");
            }
            for (int column = 0; column < line; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
    private static void drawFifthFigure() {
        for (int halfFigure = 0; halfFigure < 2; halfFigure++) {
            for (int line = 1; line <= SIDE; line++) {
                for (int column = SIDE; column > line; column--) {
                    System.out.print("  ");
                }
                for (int column = 2 * line - 1; column > 0; column--) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }

}

