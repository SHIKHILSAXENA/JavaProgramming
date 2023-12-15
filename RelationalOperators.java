public class RelationalOperators {

    public static void main(String[] args) {
        System.out.println("Logical operations for AND...");
        // Y + Y = Y
        boolean a = false;
        boolean b = true;
        if( a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("Logical operations for OR...");
        // N + N = N
        if( a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("Logical operations for NOT...");
        // !Y = N
        // !N = Y
        System.out.print("NOT(A) is ");
        System.out.println(!a);
        System.out.print("NOT(B) is ");
        System.out.println(!b);
    }
}
