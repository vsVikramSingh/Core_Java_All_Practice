import java.util.Scanner;

public class Factorial {

    public void Factorialnum()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number : ");
        num=sc.nextInt();

        int fact=1;

        int i=1;
        System.out.print("Factorial of " +num +"! = ");
        while (i <=num)
        {
            fact *= i;
            i++;
        }
        System.out.print(fact);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.Factorialnum();
    }
}
