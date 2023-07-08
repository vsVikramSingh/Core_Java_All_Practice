package LoopStatement;

public class ForPattern {


    //1
    //12
    //123
    //1234
    //12345
    public void P1()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------P1--------------------------");
    }

    //12345
    //1234
    //123
    //12
    //1
    public void P2()
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------P2--------------------------");

    }

    //1
    //22
    //333
    //4444
    //55555
    public void P3()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------P3--------------------------");
    }
    //10
    //98
    //765
    //4321
    public void P4()
    {
        int k =10;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        System.out.println("-----------------------P4--------------------------");
    }


    //     1
    //    12
    //   123
    //  1234
    // 12345
    public void P5()
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------P5--------------------------");
    }

    //     1
    //    12
    //   123
    //  1234
    // 12345
    //  2345
    //   345
    //    45
    //     5

    public void P6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------P6--------------------------");

    }
        //    1
        //   212
        //  32123
        // 4321234
        //543212345
        public void P7()
        {
            for (int i=1; i<=5; i++)
            {
                for (int j=4; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++)
                {
                    System.out.print("*");
                }
                for(int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("-----------------------P7--------------------------");
        }


    //*****
    //****
    //***
    //**
    //*
    //**
    //***
    //****
    //*****

    public void P8()
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------P8--------------------------");

    }


    //11111
    //22222
    //33333
    //44444
    //55555
    public void P9()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-----------------------P9--------------------------");

    }

    //5
    //44
    //333
    //2222
    //11111
    public void P10()
    {
        for(int i=1,c=5; i<=5; c--, i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println("-----------------------P10--------------------------");

    }


    //A
    //AB
    //ABC
    //ABCD
    //ABCDE
    public void P11()
    {
        for(char i='A'; i<='E'; i++)
        {
            for(char j='A'; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-----------------------P11--------------------------");

    }

    //A
    //BB
    //CCC
    //DDDD
    //EEEEE
    public void P12()
    {
        for(char i='A'; i<='E'; i++)
        {
            for(char j='A'; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-----------------------P12--------------------------");

    }

    //11111
    //0000
    //111
    //00
    //1
    public void P13()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print((i%2)+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------P13--------------------------");

    }

    //1
    //00
    //111
    //0000
    //11111
    public void P14()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print((i%2)+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------P14--------------------------");

    }

    //0
    //22
    //444
    //6666
    //88888
    public void P15()
    {
        for(int i=1,n=0; i<=5; i++,n=n+2)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(n);
            }
            System.out.println();
        }

        System.out.println("-----------------------P15--------------------------");

    }

    //1
    //22
    //111
    //2222
    //11111
    public void P16()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i%2==0){System.out.print(2);}
                else
                {System.out.print(1);}
            }
            System.out.println();
        }

        System.out.println("-----------------------P16--------------------------");

    }

    //*****
    //*   *
    //*   *
    //*****
    public void P17()
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j==1||j==5||i==1||i==4)
                {
                    System.out.print("*");
                }
                else
                {System.out.print(" ");}
            }
            System.out.println();
        }

        System.out.println("-----------------------P17--------------------------");

    }


    //*        *
    //**      **
    //***    ***
    //****  ****
    //**********
    //****  ****
    //***    ***
    //**      **
    //*        *
    public void P18()
    {
        int n=7;
        int x=1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j<=x) != false || j>=n-x+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if(i<=n/2)
            {
                x++;
            }
            else
            {
                x--;
            }
            System.out.println();
        }

        System.out.println("-----------------------P18--------------------------");

    }
    public static void main(String[] args) {
        ForPattern fp = new ForPattern();
        fp.P1();
        fp.P2();
        fp.P3();
        fp.P4();
        fp.P5();
        fp.P6();
        fp.P7();
        fp.P8();
        fp.P9();
        fp.P10();
        fp.P11();
        fp.P12();
        fp.P13();
        fp.P14();
        fp.P15();
        fp.P16();
        fp.P17();
        fp.P18();
    }
}
