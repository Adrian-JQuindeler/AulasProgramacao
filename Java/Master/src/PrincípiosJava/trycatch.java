package PrincípiosJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch{

    public static void main(String[] args) {
        System.out.println("Part 1:");
        method1();
        System.out.println("End of program");
        System.out.println("Part 2:");
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening file " + e.getMessage());
        }
        finally{
            System.out.println("Finally execut");
            if(sc != null){
                sc.close();
            }
        }
    }
    public static void method1(){
        System.out.println("Method1 Start");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException r){
            System.out.println("Input error");
        }
        System.out.println("Method1 End");
        sc.close();
    }
}
