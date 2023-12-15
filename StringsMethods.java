public class StringsMethods {
    public static void main(String[] args) {

        String name = "Harry";
        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String trimmed = "    harry     ";
        System.out.println(trimmed.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("rry"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("y"));
        System.out.println(name.indexOf("r",3));
        System.out.println(name.lastIndexOf("rry"));
        System.out.println(name.lastIndexOf("r",3));

        System.out.println(name.equals("HArry"));
        System.out.println(name.equalsIgnoreCase("HARRY"));


    }

}
