package LoopStatement;

import java.util.Scanner;

public class WhileTable {

    public void Table(int b)
    {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a number for table  = ");
        b = sc.nextInt();
        int a=1;
        int c =0;

        while(a<=10)
        {
            c=a*b;
            System.out.println(b+" * "+a +" = "+c);
            a++;
        }
    }
    public static void main(String[] args) {

        WhileTable wt = new WhileTable();
        int x=0;
        wt.Table(x);
    }
}
