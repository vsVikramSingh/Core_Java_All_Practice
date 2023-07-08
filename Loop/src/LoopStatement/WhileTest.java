package LoopStatement;

import java.util.Scanner;

public class WhileTest {

    public void SumPositivenum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number for for sum : ");
        //int num = sc.nextInt();
        int num=0;
        int sum=0;

        while(num >=0)
        {
            num = sc.nextInt();
            if(num>=0)
            {
                sum +=num;
                System.out.println(sum);
            }
            else
            {
                System.out.println("Please enter positive number.");
            }
            System.out.println(" Total sum of all positive number = "+sum);
        }
        System.out.println("Don't enter negative number.");
    }
    public static void main(String[] args) {

        WhileTest wt = new WhileTest();
        wt.SumPositivenum();
    }
}

