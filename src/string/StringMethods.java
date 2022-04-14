package string;

public class StringMethods {

    public static void main(String[] args) {
        String text = "Tu jestcoS napisane";
        String text2 = "wsx;edc;rfg;tgb";
        String text3 = "   ";
        String[] textTab = text2.split(";");

        for (String tabElement:textTab
             ) {
            System.out.println("tab element "+tabElement);
        }
        System.out.println("is blank " + text3.isBlank());

        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf("s"));

        System.out.println("Wycinek  " +text.substring(3,7));

        System.out.println("literka na 4 indeksie " + text.charAt(4));

        System.out.println(text.replace("ap", "BOB"));
        System.out.println(text.replaceAll("ap", "BOB"));

        boolean czySIeZawiera = text.contains("napisane");
        System.out.println(czySIeZawiera);

        System.out.println(text.startsWith("be"));
        System.out.println(text.endsWith("be"));
        System.out.println(text.startsWith("tu"));
        System.out.println(text.startsWith("Tu"));
        System.out.println(text.startsWith("Tu"));

        char[] charTab = text.toCharArray();
        for (char element:charTab) {
            System.out.println(element);
        }
    }
}
