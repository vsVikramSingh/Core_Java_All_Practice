package LoopStatement;

public class BreakConti {

    public void Numberbreak()
    {
        int sum=0;
        for(int i=1; i<=10; i++)
        {
            // Terminate the loop when i is 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }

    public void Numberconti()
    {
        for (int i = 0; i < 10; i++) {
            // If the number is 2
            // skip and continue
            if (i == 2)
                continue;

            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        BreakConti bc = new BreakConti();
        bc.Numberbreak();
        bc.Numberconti();
    }
}
