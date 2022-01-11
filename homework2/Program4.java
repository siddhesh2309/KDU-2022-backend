package homework2;

import java.util.Scanner;

public class Program4 {
    public static int isS1PresentInS2(String s1, String s2) {
        int ptr = 0, i = 0;
        for(i = 0; i < s1.length(); i++) {
            if(ptr == s2.length())
                break;
            if(s2.charAt(ptr) == s1.charAt(i)) {
                ptr++;
            } else {
                if(ptr > 0) i -= ptr;
                ptr = 0;
            }
        }
        return ptr < s2.length() ? -1 : i-1;
    }

    public static String insertS2inS1(String s1, String s2, Integer insertionIndex) {
        String ans = new String();
        if(insertionIndex < 0 || insertionIndex > s1.length()-1) {
            System.out.println("S2 can not be inserted in S1, insertionIndex out of bound");
            return ans;
        }
        for(int i = 0; i < s1.length(); i++) {
            ans += s1.charAt(i);
            if(i == insertionIndex)
                ans += s2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int insertionIndex = sc.nextInt();

        System.out.println(isS1PresentInS2(s1, s2));

        System.out.println(insertS2inS1(s1, s2, insertionIndex));
    }
}
