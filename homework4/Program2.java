import java.util.Arrays;

public class Program2 {

    public static void forLoopTime(int arr[]) {
        System.out.println("For Loop");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void forEachLoopTime(int arr[]) {
        System.out.println("For Each Loop");
        for(int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }
    
    public static void forEachStreamTime(int arr[]) {
        System.out.println("for Each Stream");
        Arrays.stream(arr)
                .forEach(e->System.out.print(e + " "));

        System.out.println();
    }

    public static void forEachParallelStreamTime(int arr[]) {
        System.out.println("for Each Parallel Stream");
        Arrays.stream(arr).parallel().forEach(System.out::println);

//        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 1, 2, 3, 4, 2, 4, 4, 8, 9, 10, 2, 32, 2, 23, 2, 3, -2, -3, -5, 4, 5, 7, 99, 12, 322, 44, 211, 100};
        long forLoopStarting = System.nanoTime();

        forLoopTime(arr);

        long forLoopEnding = System.nanoTime();

        long forEachStarting = System.nanoTime();

        forEachLoopTime(arr);

        long forEachLoopEnding = System.nanoTime();

        long forEachStreamStarting = System.nanoTime();

        forEachStreamTime(arr);

        long forEachStreamLoopEnding = System.nanoTime();

        long forEachParallelStreamStarting = System.nanoTime();

        forEachParallelStreamTime(arr);

        long forEachParallelStreamLoopEnding = System.nanoTime();
        System.out.println("FOR LOOP");
        System.out.println(forLoopStarting + " " + forLoopEnding);
        System.out.println("FOR Each LOOP");
        System.out.println(forEachStarting + " " + forEachLoopEnding);
        System.out.println("Stream");
        System.out.println(forEachStreamStarting + " " + forEachStreamLoopEnding);
        System.out.println("Parallel Stream");
        System.out.println(forEachParallelStreamStarting + " " + forEachParallelStreamLoopEnding);

    }
}
