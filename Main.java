package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //sums of 1 through n
    Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
