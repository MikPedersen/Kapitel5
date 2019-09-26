/*write a program that prompts the user to enter a java score,
if the score is greater or equal to 60 its a pass, otherwise fail
let the program end with -1*/
import java.util.Scanner;

public class Opgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the examiner");
        System.out.println("Please enter your exam score, to stop press -1");
        int score = input.nextInt();
        int max = 100;
        int min = 0;
        while (score != -1){

            if (score >= 60  && score <= max){
                System.out.println("You pass the exam");
                System.out.println("Please enter your exam score, to stop pres -1");
                score = input.nextInt();
            }
            else if (score >= min && score <= 60) {
                System.out.println("You fail the exam");
                System.out.println("Please enter your exam score, to stop pres -1");
                score = input.nextInt();
            }

        }




        }

    }

