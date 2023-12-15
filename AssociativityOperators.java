public class AssociativityOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;
        int d = a * b - c;
        int e = b * b - (4 * a * c )/(2 * a);

        // 400 - 400 / 20
        // 400-20
        // 380

        int f = a * a - b * b;
        //100-400
        // -300

        int g = b - a/2;
        // 20 - 10/2
        //20-5
        //15


        System.out.println(g);
        System.out.println(f);
        System.out.println(e);
        System.out.println(d);
    }
}
