package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program5 {

    public static void IOException() {
        try {
            String s = null;
            int len = s.length();
        } catch(NullPointerException e) {
            System.out.println("Program Crashed");
        }

        System.out.println("Continue Program's execution as normal");
        File file = new File("test.txt");

        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write("HELLO WORLD".getBytes());
            out.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File wasn't found. Aborting write");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception. Couldn't finish writing the file");
        }
    }

    public static void numberFormatException() {
        try {
            Scanner sc = new Scanner(System.in);

            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());

            int result = num1 / num2;

            System.out.format("%d/%d = %d", num1, num2, result);
            sc.close();
        } catch(NumberFormatException e) {
            System.out.println("Invalid format");
            System.out.println(e.getMessage());
        }
    }

    public static void arithmeticException() {
        int a = 10, b = 5, c = 5, x, y;

        try {
            x = a/(b-c);
        } catch(ArithmeticException e) {
            System.out.println("Program Crashed");
            System.out.println(e.getMessage());
        }
    }

    public static void arrayIndexOutOfBound() {
        Random r = new Random();
        int a[] = new int[5];

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(5);
        }

        try {
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum index is 4");
            System.out.println(e.getMessage());
        }
    }

    public static void nestedTryCatchFinally() {
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index: ");
            int x = sc.nextInt();
            try {
                System.out.println("Welcome to KDU 2022");
                try {
                    System.out.println(marks[x]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
            finally {
                System.out.println("Program Ended Thanks");
            }
        }
    }

    public static void main(String[] args) {
//        IOException();
//        numberFormatException();
//        arithmeticException();
//        arrayIndexOutOfBound();
        nestedTryCatchFinally();
    }
}
