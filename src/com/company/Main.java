package com.company;

import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner str = new Scanner(System.in);
        int NaturalnoeCHislo = str.nextInt();
        int Delitel = NaturalnoeCHislo;
        while (Delitel != 0) {
            if (NaturalnoeCHislo % Delitel == 0)
                System.out.print(Delitel + " ");
            --Delitel;
        }
    }
}
