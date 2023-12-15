import java.util.Scanner;
public class PracticeQuestion3 {

    public static void main(String[] args) {
        //Q1
        String name = "SHIKHIL";
        System.out.println(name.toLowerCase());

        //Q2
        String str =" Shikhil ";
        System.out.println(str.replace(" ","_"));

        //Q3
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("Dear" + str1 +",Thanks a lot!!!");

        //Q4
        String str2 ="Dear Harry,\nThis Java course is nice.\nThanks";
        System.out.println(str2);


    }
}
