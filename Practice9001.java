import java.util.Scanner;
public class Practice9001 {

    public static void main(String[] args) {

        int age = 19;
        boolean cond = (age == 18);
        System.out.println("For Logical AND....");
        boolean a = true;
        boolean b = false;
        if (cond) {
            System.out.println("Yes boy you can drive!");
        } else {
            System.out.println("You cannot drive!");
        }

        if (a && b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("FOR LOGICAL OR....");

        if (a || b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("FOR LOGICAL NOT....");
        System.out.println("NOT A is...");
        System.out.println(!a);
        System.out.println("NOT B is ....");
        System.out.println(!b);

        int var;
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        if (var >= 2 && var <= 5) {
            System.out.println("You are a Software Developer!");
        } else if (var >= 5 && var <= 10) {
            System.out.println("You are a senior software developer!");

        } else if (var > 10) {
            System.out.println("You are a Assistant Team lead!!");
        } else {
            System.out.println("You are a fresher!");
        }

        String var1 = "Harry";

        switch (var1) {
            case "Shubham":
                System.out.println("You are working in a job!");
                break;

            case "Vikrant":
                System.out.println(" You are business man!");
                break;
            case "Harry":
                System.out.println("You are famous youtuber");
                break;
            default:
                System.out.println("You are unemployed!");
        }
        System.out.println("Thanks for coding in Java!");

        int a1 = 10;
        if (a1 == 11) {
            System.out.println("I am 11!");
        } else {
            System.out.println("I am not 11!");
        }

        System.out.println("Enter the Subjects name: ");

        float Science = sc.nextFloat();
        System.out.println("Science marks is: " + Science);
        float English = sc.nextFloat();
        System.out.println("English marks is :" + English);
        float Maths = sc.nextFloat();
        System.out.println("Maths marks is:" + Maths);

        float total = (Science + English + Maths) * 100 / 300;
        System.out.println("Total marks is :" + total);

        if (total >= 40 && Science >= 33 && Maths >= 33 && English >= 33) {
            System.out.println("The student is pass!!");
        } else {
            System.out.println("The Student is fail!");
        }

        System.out.println(" Enter the Employee Salary per year:");

        float calculate_salary = 0;
        float employee_salary = sc.nextFloat();
        System.out.println(" Employee Salary per year is :" + employee_salary);

        if (employee_salary <= 2.5f) {
            calculate_salary = employee_salary + 0;

        } else if (employee_salary > 2.5 && employee_salary <= 5.0f) {

            calculate_salary = (employee_salary - 2.5f) * 0.05f;

        } else if (employee_salary > 5.0f && employee_salary <= 10.0f) {

            calculate_salary = calculate_salary + 0.05f * (5.0f - 2.5f);
            calculate_salary = calculate_salary + 0.2f * (employee_salary - 5.0f);

        } else if (employee_salary > 10.0f) {
            calculate_salary = calculate_salary + 0.05f * (5.0f - 2.5f);
            calculate_salary = calculate_salary + 0.2f * (10.0f - 5.0f);
            calculate_salary = calculate_salary + 0.3f * (employee_salary - 10.0f);
        }

        System.out.println("Total tax to be paid by an employee salary per annum is :" + calculate_salary);
        }
}
