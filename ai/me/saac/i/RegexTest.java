package me.saac.i;
import java.util.regex.*;

public class RegexTest {
    public static void main(String[] args) {
	Pattern p = Pattern.compile("Small Bet: ([0-9])+");
	String s = "Small Bet: 9";
	Matcher m = p.matcher(s);
	System.out.println("Matches: " + m.find());
	System.out.println("Group: " + m.group(1));
    }

}