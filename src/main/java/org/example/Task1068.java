package org.example;

import java.util.Scanner;
public class Task1068 {
    public static void main(String[] args) {
        int c = 0;
        Scanner n = new Scanner(System.in);
        int f = n.nextInt();
        n.close();
        if (f > 0)
        {
            for (int i = 1; i <= f; i++)
                c += i;
            System.out.println(c);
        }
        else if (f <= 0)
        {
            for (int i = f; i <= 1; i++)
                c += i;
            System.out.println(c);
        }

    }
}

