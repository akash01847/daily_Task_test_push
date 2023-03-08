import java.io.*;
import java.util.*;

public class Solution_day_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++)
        {
            String S = sc.nextLine();

            String evenChars = "";
            String oddChars = "";

            for (int j = 0; j < S.length(); j++)
            {
                if (j % 2 == 0)
                {
                    evenChars += S.charAt(j);
                }
                else
                {
                    oddChars += S.charAt(j);
                }
            }

            System.out.println(evenChars + " " + oddChars);
        }
        sc.close();
    }
}