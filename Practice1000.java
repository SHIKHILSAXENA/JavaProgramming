import java.util.Scanner;
public class Practice1000 {

    public static void main(String[] args) {
        String name ="Harry";
        int value = name.length();
        System.out.println(value);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nontrimmed1 = "   Harry   ";
        System.out.println(nontrimmed1);

        String trimmed = nontrimmed1.trim();
        System.out.println(trimmed);

        System.out.println(name.substring(2));
        System.out.println(name.substring(0,5));

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,4));
        System.out.println(name.replace("rry","ppy"));

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("r",1));

        System.out.println(name.equals("HaRry"));
        System.out.println(name.equalsIgnoreCase("hArRy"));

        String Name ="HARRY";
        System.out.println(Name.toLowerCase());

        String Rs ="H A R R Y";
        System.out.println(Rs.replace(" ","_"));

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String y = "Dear <|name|> ,Thanks a lot ";

        System.out.println(y.replace("<|name|>",s));

        String Rss = "H  arr   y";

        System.out.println(Rss.indexOf("  "));
        System.out.println(Rss.indexOf("   "));

        String myString ="Dear Harry,\n\tThis Java Course is nice.\nThanks!";
        System.out.println(myString);

        int age = 20;
        if(age >18){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You cannot drive!");
        }

        boolean a = true;
        boolean b = false;

        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("For Not logical operators :");
        System.out.println("For Not a: ");
        System.out.println(!a);
        System.out.println("for not b :");
        System.out.println(!b);

    }
}
