import java.util.Scanner;
public class PracticeQuestion4 {

    public static void main(String[] args) {
        //Q1
        int a =10;
        if(a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
        //O/p : error

        //Q2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject marks ");
        float science =  sc.nextFloat();
        System.out.println("Science marks: "+science);
        float socialScience = sc.nextFloat();
        System.out.println("socialscience marks: "+socialScience);
        float hindi = sc.nextFloat();
        System.out.println("hindi marks : "+hindi);

        float total = (science + socialScience + hindi)/300;

        if(total >= 0.4 && science >=0.33 &&  socialScience >=0.33 && hindi >=0.33 ){
            System.out.println("Student is paased !");
        }
        else{
            System.out.println("Student is failed!");
        }

        //Q3
        System.out.println("Enter your annual Salary: ");
        float annualEmployeeSalary = sc.nextFloat();
        System.out.println("Annual Salary is : " +annualEmployeeSalary);
        float rateOfTax = sc.nextFloat();
        System.out.println("Enter your rate of interest : " +rateOfTax);

        float incomeTax = (annualEmployeeSalary * rateOfTax)/100;
        System.out.println("Income tax to employee : "+incomeTax );

        if(annualEmployeeSalary >= 250000 && annualEmployeeSalary< 500000){
            System.out.println("Employee has to pay 5% income tax: " +incomeTax);
        }
        else if (annualEmployeeSalary >=500000 && annualEmployeeSalary< 1000000) {
            System.out.println("Employee has to pay 20% income tax: " +incomeTax);
        }
        else if (annualEmployeeSalary >=1000000) {
            System.out.println("Employee has to pay 35% income tax: " +incomeTax);
        }
        else {
            System.out.println("You are not elgible to pay any income tax");
        }

        //Q4
        System.out.println("Enter a number of week: ");
        int week = sc.nextInt();
        System.out.println("week: " +week);
        switch (week){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Happy Holidayss!!!!");
        }
        //Q5
        System.out.println("Enter year :");
        int leapyear = sc.nextInt();
        if(leapyear %4 == 0){
            System.out.println("this year  is leap  year "+leapyear);
        }
        else {
            System.out.println("this year is not leap year "+leapyear);
        }
        // Q6
        System.out.println("Enter url : ");
        String websiteUrl = sc.next();
        if (websiteUrl.endsWith(".com")){
            System.out.println("This is a commercial website");
        } else if (websiteUrl.endsWith(".org")) {
            System.out.println("This is an organisation website");
        } else if (websiteUrl.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
        else {
            System.out.println("Not secured!!!");
        }
    }
}
