package LoopStatement;

import java.util.Scanner;

public class Fabonacinum {

    public void Fab()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num= sc.nextInt();
        int c=0,a=1,b=1;
        for(int i=0; i<=num; i++)
        {
           c= a+b;
           System.out.print(c +"\t");
           a=b;
           b=c;
        }
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        Fabonacinum fn = new Fabonacinum();
        fn.Fab();
    }
}
