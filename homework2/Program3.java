package homework2;
import java.util.*;

public class Program3 {

    public static void RemoveDuplicatesCharacters(String str) {
        LinkedHashSet<Character> ans = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++) {
            ans.add(str.charAt(i));
        }
        for(Character ch : ans) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        RemoveDuplicatesCharacters(str);
    }
}
