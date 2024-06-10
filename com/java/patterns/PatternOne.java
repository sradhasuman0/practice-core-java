package com.java.patterns;

import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=1; j<=n; j++)
        {
            for(int i = 1; i<= n; i++)
            {
                System.out.print(n-i+1);
            }
            System.out.println(" ");
        }

    }
}
