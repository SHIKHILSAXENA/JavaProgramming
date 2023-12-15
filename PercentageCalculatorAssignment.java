import java.util.Scanner;
public class PercentageCalculatorAssignment {

    public static void main(String[] args) {

        System.out.println("Enter marks of each subjects");
        Scanner sc = new Scanner(System.in);
        float english = sc.nextInt();
        System.out.println("English marks is : " + english);
        float maths = sc.nextInt();
        System.out.println("Maths marks is : "+ maths);
        float hindi = sc.nextInt();
        System.out.println("Hindi marks is : " + hindi);
        float socialScience = sc.nextInt();
        System.out.println("SocialScience marks is : " + socialScience);
        float computerScience = sc.nextInt();
        System.out.println("ComputerScience marks is : " + computerScience);

        float totalMarks = ((english + maths + hindi + socialScience + computerScience)/500) * 100 ;
        System.out.println(totalMarks);

    }
}
