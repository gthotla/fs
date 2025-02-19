// Given a non-empty string s and an abbreviation abbr, 
// return whether the string matches with the given abbreviation.

// A string such as "word" contains only the following valid abbreviations:
// ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]

// Notice that only the above abbreviations are valid abbreviations of the string "word". 
// Any other string is not a valid abbreviation of "word".

// Note: Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.

// Input Format:
// -------------
// Line-1: A string, S contains only lowercase letters
// Line-2: A string, abbr contains lowercase letters and digits

// Output Format:
// --------------
// Line-1: A boolean value.
// Sample Input-1:
// ---------------
// internationalization
// i12iz4n

// Sample Output-1:
// ---------------
// true

// Sample Input-2:
// ---------------
// apple
// a2e

// Sample Output-2:
// ---------------
// false

// Time Complexity: O(n) where n=max(len(word),len(abbr))
// Auxiliary Space:  O(1).
import java.util.*;
public class ValidWordAbbreviation{
    public static boolean isValid(String s, String abbr){
        int left=0,right=0;
        int n1=s.length(),n2=abbr.length();
        while(left<n1 && right<n2){
            int number=0;
            if(Character.isDigit(abbr.charAt(right))){
                if(abbr.charAt(right)=='0' && number==0){
                    return false;
                }
                while(Character.isDigit(abbr.charAt(right)) && right<n2){
                    number=number*10+ abbr.charAt(right)-'0';
                    right++;
                }
                left+=number;
            }
          else  if(s.charAt(left)!=abbr.charAt(right)){
                return false;
            }
            else{
            left++;
            right++;
            }
        }
        return left==n1 && right==n2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String abbr=sc.next();
        System.out.print(isValid(s,abbr));
    }
}