import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findEvenOdd();
    }
    public static void findEvenOdd() {
        int N = 1000;
        for(int i = 1; i < N; i++) {
            if(i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
