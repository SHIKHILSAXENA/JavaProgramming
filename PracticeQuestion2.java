import java.util.Scanner;
public class PracticeQuestion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float f = 7 / 4 * 9 / 2;
        // 1*9/2
        //4.0
        System.out.println(f);

        char grade = 'B';
        grade  = (char)(grade + 8);
        System.out.println(grade);
        grade  = (char)(grade - 8);
        System.out.println(grade);

        int h = 6;
        int d = sc.nextInt();
        System.out.println(d > h);

        int s = 1;
        int v = 2;
        int a = 3;
        int u = 4;

        int y=  (v * v - u * u) /( 2 * a * s);
        //4 - 16 / 6
        //4 -2
        //-2
        System.out.println(y);

        int x  = 7 ;
        int k = 7 * 49 / 7 + 35 / 7 ;
        //7 * 7 + 35 / 7
        //7 * 7 + 5
        //49 +5
        //54
        System.out.println(k);

    }
}
