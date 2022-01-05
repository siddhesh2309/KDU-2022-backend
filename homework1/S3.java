import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sumOfDigits(N);
    }
    public static void sumOfDigits(int N) {
        int sum = 0;
        while(N > 0) {
            sum += N%10;
            N /= 10;
        }
        System.out.println(sum);
    }
}
