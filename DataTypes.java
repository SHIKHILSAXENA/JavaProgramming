public class DataTypes {

    public static void main(String[] args) {

        byte s = 5;
        int a = 10;
        long d = 5666666666L;
        float f = 6.54f;
        double d1 = 4.6;

        System.out.println(a+s);
        System.out.println(d + f);
        System.out.println(d1 + d);
        System.out.println(d1 + f);


        int k = 10;
        int c = k++;
        int o = ++k;
        int z = k--;
        int y = --k;
        System.out.println(c);
        System.out.println(k++);
        System.out.println(k);
        System.out.println(k++);
        System.out.println(++k);

        int p = 7;
        int l =  ++p  * 8;
        System.out.println(l);
        char ch = 'A';
        System.out.println(ch++);





    }
}
