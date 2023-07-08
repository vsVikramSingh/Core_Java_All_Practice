package LoopStatement;

import java.util.Scanner;

public class DoWhileDemo {


    public  void Number()
    {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();

        do
        {
            System.out.println(i);
            i++;
        }while(i<10);
    }
    public static void main(String[] args) {
        DoWhileDemo dwd = new DoWhileDemo();
        dwd.Number();
    }
}
