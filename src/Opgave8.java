/*write program takes takes input about how many student are included,
take names and scores, and display highest score and name
 */
import java.util.Scanner;

public class Opgave8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the student highscore");
        System.out.println("How many students are included in this?");
        int numberOfStudents = input.nextInt();
        String name = "";
        int score = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please enter the name and score");
            String name2 = input.next();
            int inputscore = input.nextInt();
            if (inputscore > score) {
                score = inputscore;
                name = name2;
            }

        }
        System.out.println("Highscore is " + score + " by " + name);
    }
}
