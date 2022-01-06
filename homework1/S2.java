import java.util.Scanner;
public class S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 1;
        int q = 4;
        int r = 7;
        int N = sc.nextInt();
        int s = p+q+r;
        System.out.print(p + " " + q + " " + r + " ");
        for(int i = 0; i < N-3; i++) {
            p = q;
            q = r;
            r = s;
            s = p+q+r;
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
