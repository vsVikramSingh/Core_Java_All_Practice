package ArithmeticOperators;

import java.util.Scanner;

public class GrossSalary {

    public void GrossSal()
    {
        Scanner sc = new Scanner((System.in));
        System.out.print("Pleas enter basic salary : ");
        int basic = sc.nextInt();
        System.out.print("Pleas enter hra of salary : ");
        int hra = sc.nextInt();
        System.out.print("Pleas enter da of  salary : ");
        int da = sc.nextInt();

        hra = (basic*hra)/100;
        da = (basic*da)/100;

        int totalsalary = basic+hra+da;

        System.out.print("Total salary with hra and da is = "+totalsalary);

    }
    public static void main(String[] args)
    {
        GrossSalary gs = new GrossSalary();
        gs.GrossSal();
    }
}
