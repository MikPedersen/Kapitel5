/*Display the ASCII character table from appendix B, write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters pr line. Characters are separated by exactly one space
 */
public class Opgave15 {
    public static void main(String[] args) {
        System.out.println("                           ASCII table");

        for (int i = 0; i <= 9; i++) {
            System.out.print("      " + i);
        }
        System.out.println("\n--------------------------------------------------");

        for (int i = 0; i <= 0; i++) {
            System.out.print(i + " | ");
            for (int j = 33; j < 42; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            System.out.print(i + " | ");
            for (int j = 42; j < 51; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 2; i <= 2; i++) {
            System.out.print(i + " | ");
            for (int j = 51; j < 60; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 3; i <= 3; i++) {
            System.out.print(i + " | ");
            for (int j = 60; j < 69; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 4; i <= 4; i++) {
            System.out.print(i + " | ");
            for (int j = 69; j < 78; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 5; i <= 5; i++) {
            System.out.print(i + " | ");
            for (int j = 78; j < 87; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 6; i <= 6; i++) {
            System.out.print(i + " | ");
            for (int j = 87; j < 96; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 7; i <= 7; i++) {
            System.out.print(i + " | ");
            for (int j = 96; j < 105; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 8; i <= 8; i++) {
            System.out.print(i + " | ");
            for (int j = 105; j < 114; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 9; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 114; j < 123; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
        for (int i = 10; i <= 10; i++) {
            System.out.print(i + " | ");
            for (int j = 123; j < 127; j++) {
                System.out.printf("%d : %c  ", j, j);
            }
            System.out.println();
        }
    }
}

