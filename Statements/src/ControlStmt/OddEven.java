package ControlStmt;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter : ");
        int num = sc.nextInt();

        if((num/2)==0)
        {
            System.out.print(num+" is even number ");
        }
        else
        {
            System.out.print(num+" is odd number ");
        }
    }
}
