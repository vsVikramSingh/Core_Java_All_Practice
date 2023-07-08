package ControlStmt;

import java.util.Scanner;

public class CheckVowel {

    public void CheckVowelOrNot()
    {
        System.out.println("Enter the character : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if('a'==c | 'e'==c | 'i'==c | 'o'==c | 'u'==c | 'A'==c | 'E'==c | 'I'==c | 'O'==c | 'U'==c )
        {
            System.out.print("Character is "+c +" is vowel");
        }
        else
        {
            System.out.print("Character is "+c +" is consonant");
        }
    }

    public static void main(String[] args) {
        CheckVowel cv = new CheckVowel();
        cv.CheckVowelOrNot();
    }
}
