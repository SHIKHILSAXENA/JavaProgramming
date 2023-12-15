import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Practice9002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Numerical Day of the week:");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("No Day!!!");
        }
        System.out.println(" Enter the year to find out the leap year:");

        int year = sc.nextInt();

        if(year % 4 == 0&& year % 100!=0 || year % 400 == 0){
            System.out.println("Year is leap year:" +year);
        }
        else{
            System.out.println("Year is not a leap year!");
        }

        System.out.println("Enter the type of website on browser:");

            String url = sc.next();
            
            if(url.endsWith(".com")){
                System.out.println("This is a commercial website! " +url);
            } else if (url.endsWith(".org")) {
                System.out.println("This is a organization website! " +url);
            } else if (url.endsWith(".in")) {
                System.out.println("This is a indian website "+url);
            }
            else{
                System.out.println("No such website found!!! "+url);
            }

        System.out.println(" Welcome to the Game!!!");

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = sc.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!"+playerMove +computerMove);
        } else if (playerMove == "rock" || computerMove == "scissors") {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
        if(playerMove =="paper" || computerMove == "rock"){
            System.out.println("Player wins!");
        }
        else {
            System.out.println("Computer wins!");
        }
        if(playerMove == "scissors" || computerMove == "paper"){
            System.out.println("Player Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
    }

}
