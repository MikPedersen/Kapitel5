/*Write a program that simulates flipping a coin two million times,
and displays the number of heads and tails*/

public class Opgave40 {

    public static void main(String[] args) {
        int heads= 0;
        int tails = 0;
        for (int i = 0; i < 2000000; i++) {
            int outcome = (int)(Math.random()*2);
            if (outcome == 0){
                heads++;
            }
            else
                tails++;
        }
        System.out.println(heads + " number of heads rolls and " + tails + " number of tails rolls");
    }
}
