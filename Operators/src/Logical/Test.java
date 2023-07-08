package Logical;

public class Test {


    int a=5, b=5, c=10;
    public void And()
    {
        boolean result = ((a==b) && (c>b));
        System.out.print("And result = "+result +"\n");
    }
    public void Or()
    {
        boolean result = ((a==b) || (c>b));
        System.out.print("Or result = "+result +"\n");
    }
    public void Not()
    {
        boolean result = ((a != b) || (c<b));
        System.out.print("Not result = " + result +"\n");
    }

    public void Ex()
    {
        int a=58;
        int b =13;

        System.out.print(" Value is " +(a & b));
        System.out.print(" Value is " +(a | b));
    }

    public static void main(String[] args)
    {
        Test ts = new Test();
        ts.And();
        ts.Or();
        ts.Not();
        ts.Ex();
    }
}
