import java.util.Scanner;
public class S4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j=1;
        if(n>0)
        {
            while(i <= n)
            {
                if(j % 3 != 0)
                {
                    System.out.print(i + " ");
                    i += 4*j;
                }
                j++;
            }
        }
        System.out.println();
    }
}
