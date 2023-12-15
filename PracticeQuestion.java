import java.util.Scanner;
public class PracticeQuestion {
    //Question 1
    public static void main(String[] args) {

        int a = 26;
        int b = 34;
        int c = 55;
        int sum = a + b + c;
        System.out.println(sum);


        //question 2
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Hello " + str + " have a good day" );

        //question3
        boolean t = sc.hasNextInt();
        System.out.println(t);

        //question 4
        float english = 45;
        float hindi = 55;
        float maths = 85;
        float cgpa = (english + hindi + maths )/30;
        System.out.println(cgpa);

        //question 5
        float k = 2.0f;
        double e =  (float) k * 0.621371;
        System.out.println(e);

    }

}
