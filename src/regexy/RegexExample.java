package regexy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(ab){4,}[a-h9]");
        Matcher matcher = pattern.matcher("ababababh rjrjrtjrtjrtj");

//        Pattern pattern = Pattern.compile("a+bcd");
//        Matcher matcher = pattern.matcher("aaaaabcd");
//        Matcher matcher2 = pattern.matcher("aaaaabcdghghgh");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
//        System.out.println(matcher.matches());  // zwraca true/false
//        System.out.println(matcher.find());  // zwraca true/false
    }
}
