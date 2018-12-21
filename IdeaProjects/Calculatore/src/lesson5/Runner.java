package lesson5;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println ("ввести число а: ");
        int a = sc.nextInt();
        System.out.println("вести число b:");
        int b = sc.nextInt();




        boolean calculate;
        calculate = true;
        while(calculate){
            System.out.println ("to add: 1 ");
            System.out.println ("to minus: 2 ");
            System.out.println ("to mult: 3 ");
            System.out.println ("to div: 4 ");
            int operation = sc.nextInt();



        }



    }
}
