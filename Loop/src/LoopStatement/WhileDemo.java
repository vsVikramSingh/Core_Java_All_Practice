package LoopStatement;

public class WhileDemo {

    public void Number()
    {
        int a=1;

        while (a<=10)
        {
            System.out.println(a);
            a++;
        }
    }
    public static void main(String[] args) {
        WhileDemo wd = new WhileDemo();
        wd.Number();
    }
}
