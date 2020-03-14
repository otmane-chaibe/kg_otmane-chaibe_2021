import java.util.Set;
import java.util.HashSet;

/*
Question:
Determine whether a one-to-one character mapping exists from one string, s1, to another string,
s2.
For example, given s1 = abc and s2 = bcd, print "true" into stdout since we can map each
character in "abc" to a character in "bcd".
Given s1 = foo and s2 = bar, print "false" since the character ‘o’ cannot map to two characters.
But given s1 = bar and s2 = foo, print "true" since each character in "bar" can be mapped to a
character in "foo".
*/

/*
since in mapping you only care about the first arguments to not have duplicates 
I just looped over the first argument, put each character in a hashset and then 
compared the size of the hashset to the length of the string if they are equal 
then that means that there were no duplicates else there are duplicates

*/
public class Solution { 
    
    public static void main(String args[]) 
    { 
        Set<Character> set = new HashSet<>();
        String str=args[0];
        
        for (int i = 0; i < str.length(); i++) {
            set.add(new Character(str.charAt(i)));
        }

        if (set.size() == str.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    } 
} 
