package ArithmeticOperators;

import java.util.Scanner;

public class SimpleIntrest {

    public void SimInt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amount = "+'\n');
        int principal= sc.nextInt();
        System.out.print("Rate of interest is = "+'\n');
        int rate= sc.nextInt();
        System.out.print("Time  = "+"\n");
        int time=sc.nextInt();

        float simpleintrest= (principal*rate*time)/100;


        System.out.println("Total payable amount is = "+(simpleintrest+principal));

    }
    public static  void main(String[] args)
    {
        SimpleIntrest si = new SimpleIntrest();
        si.SimInt();
    }
}
