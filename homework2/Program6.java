package homework2;
import java.util.Scanner;

class ParallelLines extends Exception {  //Custom Exception ParallelLines
    public ParallelLines(String s) {
        super(s);
    }
}

public class Program6 {

    public static void parallelIntersecting(int m1, int c1, int m2, int c2) throws ParallelLines{
        try {
            if(c1 != c2 && m1 == m2) {  // Condition for parallel lines
                throw new ParallelLines("Lines are Parallel to each other");
            }
            else if(m1 == m2 && c1 == c2) {  // Condition for same lines
                System.out.println("Lines are similar to each other");
            }
            else {  // If lines are neither parallel nor same then lines are intersecting
                int x = (c2-c1) / (m1-m2); // X-intercept of intersection point
                int y = (m2*c1 - m1*c2) / (m1-m2); // Y-intercept of intersection point
                System.out.println("Lines are intersecting to each other ans intersection point is: (" + x + ", " + y + ")");

            }
        } catch (ParallelLines e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Program crashed");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws ParallelLines {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m1(slope) of line a");
        int m1 = sc.nextInt();
        System.out.println("Enter c1(Y intercept) of line a");
        int c1 = sc.nextInt();
        System.out.println("Enter m2(slope) of line b");
        int m2 = sc.nextInt();
        System.out.println("Enter c2(Y intercept) of line b");
        int c2 = sc.nextInt();

        parallelIntersecting(m1, c1, m2, c2);
    }
}
