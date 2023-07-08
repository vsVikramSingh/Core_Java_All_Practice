package ControlStmt;

import java.util.Scanner;

public class Ifelse {

    public void Add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers for Addition : ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        if((a > 0) && (b >0))
        {
            System.out.print("a = " +a +" b= "+b +"\n");
            int c = a+b;
            System.out.print(" c = "+c);
        }
        else
        {
            System.out.print("Please enter positive number.");
        }
    }
    public static void main(String[] args)
    {
        Ifex obj = new Ifex();
        obj.Add();
    }
}
