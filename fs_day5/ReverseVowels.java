

/*Given a string s, reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Sample Input-1:
---------------
hello

Sample Output-1:
----------------
holle

Sample Input-2:
----------------
Keshavmemorial

Sample Output-2:
----------------
Kashivmomerael
 */
import java.util.*;
public class ReverseVowels{
public static String reverseVowels(String s){
    int low=0,high=s.length()-1;
    List<Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    char []c=s.toCharArray();
    while(low<high){
        if(vowels.contains(c[low])&&vowels.contains(c[high])){
            char temp=c[low];
            c[low]=c[high];
            c[high]=temp;
            low++;
            high--;
        }
        else if(!vowels.contains(c[low])){
            low++;
        }
        else if (!vowels.contains(c[high])){
            high--;
        }
    }
    return new String(c);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(reverseVowels(s));
}
}