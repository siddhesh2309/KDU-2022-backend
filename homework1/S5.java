import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = isPalindrome(s);
        if(flag) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    static boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0, j = len-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
