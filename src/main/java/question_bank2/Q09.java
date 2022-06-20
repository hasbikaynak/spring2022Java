package question_bank2;

public class Q09 {
    public static void main(String[] args) {
        //Write a program to display the following character rhombus structure.
        //Test Data
        //n the number: 7
        //Output: A
        //       ABA
        //      ABCBA
        //     ABCDCBA
        //    ABCDEDCBA
        //   ABCDEFEDCBA
        //  ABCDEFGFEDCBA
        //   ABCDEFEDCBA
        //    ABCDEDCBA
        //     ABCDCBA
        //      ABCBA
        //       ABA
        //        A


        int n = 7;

        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++)
        {
            for (int spc = n - count2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < n)
            {
                count2++;
            }
            else
            {
                count2--;
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(c);//print Character
                if (j < count / 2)
                {
                    c++;
                } else
                {
                    c--;
                }
            }
            if (i < n)
            {
                count = count + 2;
            }
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}
