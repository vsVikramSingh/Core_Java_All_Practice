package ControlStmt;

import java.util.Scanner;

public class Grades {

    public void Grade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 subjects numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double obtainMarks = (a+b+c)/3 ;

        if(obtainMarks >= 60)
        {
            System.out.print("Grade : A");
        }
        else if ((obtainMarks >= 45) && (obtainMarks <=59))
        {
            System.out.print("Grade : B");
        }
        else if ((obtainMarks >= 30) && (obtainMarks <=44))
        {
            System.out.print("Grade : C");
        }
        else if ((obtainMarks >= 17) && (obtainMarks <=29))
        {
            System.out.print("Grade : D");
        }
        else if (obtainMarks <= 17)
        {
            System.out.print("Grade : Fail");
        }
    }
    public static void main(String[] args)
    {
        Grades gd = new Grades();
        gd.Grade();
    }
}
