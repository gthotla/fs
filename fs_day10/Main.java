package fs_day10;
public class Main {

    public static void main(String[] args) {
        String str = "madam";
        int result = canBePalindrome(str);
        System.out.println("Can be palindrome: " + (result == 0));
    }

    public static int canBePalindrome(String str) {
        if (str.length() % 2 != 0) {
            return -1; // String length must be even
        }

        int[] counts = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            counts[c]++;
        }

        int xorResult = 0;
        int oddCount = 0;
        for (int count : counts) {
            if ((count & 1) != 0) { // Count with odd occurrence
                oddCount++;
            }
            if (oddCount > 1) { // More than one character with odd occurrence
                return -1; // String cannot be palindrome with more than one odd count of any character
            }
            int temp = xorResult ^ count;
            if (temp < 0 || temp > str.length() / 2) {
                break;
            }
            xorResult = temp;
        }

        return 1; // All characters can be paired up
    }
}