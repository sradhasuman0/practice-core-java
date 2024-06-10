package com.java.patterns;

import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1; r<=n; r++){

            for(int c=1; c<=r; c++)
            {
                System.out.print(r);
            }
            System.out.println(" ");
        }

    }
}
