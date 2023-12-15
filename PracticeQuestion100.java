import java.util.Scanner;
public class PracticeQuestion100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subject marks :");

        float English = sc.nextFloat();
        float Maths = sc.nextFloat();
        float Hindi = sc.nextFloat();
        float Science = sc.nextFloat();
        float SocialScience = sc.nextFloat();

        float calculate = (English + Maths + Hindi + Science + SocialScience) * 100 / 500;

        System.out.println("Calculate percentage of a given Student in CBSE BOARD Exam :" + calculate);


    }
}
