package LoopStatement;

import java.util.Scanner;

public class FactorialNum {

    public void Factorial()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter factorial number : ");
        int num = sc.nextInt();
        int i=1;
        int fact=1;

        System.out.print("Factorial of " +num +"! = ");
        while (i <=num)
        {
            fact *= i;
            i++;
        }
        System.out.print(fact);
    }

    public static void main(String[] args) {
        FactorialNum fn = new FactorialNum();
        fn.Factorial();
    }
}
