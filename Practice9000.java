import java.util.Scanner;
public class Practice9000 {

    public static void main(String[] args) {

        String name ="S Hik h  i   l";

        String Mango = "Dear <|name|>, Thanks a lot!";

        String letter = "Dear Harry,\nThis Java course is nice.\nThanks!";

        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ", "_"));
        System.out.println(Mango.replace("<|name|>","Harry"));
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        System.out.println(letter);



    }

}
