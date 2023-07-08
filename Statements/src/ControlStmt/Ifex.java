package ControlStmt;

import java.util.Scanner;

public class Ifex {

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
    }
    public static void main(String[] args)
    {
        Ifex obj = new Ifex();
        obj.Add();
    }
}
