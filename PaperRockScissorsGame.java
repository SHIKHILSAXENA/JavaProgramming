import java.util.Scanner;
import java.util.Random;
public class PaperRockScissorsGame {
    public static void main(String[] args) {
        System.out.println("Start the game : ");
        Scanner sc = new Scanner(System.in);
        int paper    = 0;
        System.out.println("paper : " + paper );
        int rock     = 1;
        System.out.println("rock : " +rock);
        int scissors = 2;
        System.out.println("scissors : " +scissors);

        Random r = new Random();
        int a = r.nextInt(3);
        System.out.println(a);

        if(paper == a ){
            System.out.println("Paper win!!");
        } else if (rock ==a  ) {
            System.out.println("Rock win!!!");
        } else if (scissors ==a ) {
            System.out.println("scissors win!!!!");
        }
        else {
            System.out.println("tie game");
        }
        System.out.println("End Game!!!");
    }
}
