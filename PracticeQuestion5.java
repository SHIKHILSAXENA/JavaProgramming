public class PracticeQuestion5 {

    public static void main(String[] args) {
        //Q1
        /* int n = 4;
        for(int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

         */

        //Q2

        //even numbers
       /*  int a = 4;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + (2 * i);
        }
        System.out.println("sum of even number : ");
        System.out.println(sum);

        */

        //Q3
       /* int n = 5;
        for (int i =1;i<10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }


        */
        //Q4
        /*int n = 10;
        for (int i = 10;i!=0;i--){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }

         */

        //Q5

       /* int n =5;
        int i =1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

        */

        //Q6
        int n =8;
        int sum = 0;
        for (int i=1;i<n;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}