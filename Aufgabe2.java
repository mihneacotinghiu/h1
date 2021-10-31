package com.company;

import java.util.Scanner;

class Aufgabe2 {
    public static void main(String[] args) {
        //pr1, calculam numarul maxim din araray
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n = ");
        n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Enter all n elements: ");
        for (int i=0; i<n; i++)
        {
            array[i] = s.nextInt();
        }

        int nrMax = array[0];

        for ( int j : array)
        {
            if ( j > nrMax)
                nrMax = j;
        }
        System.out.println("Nr maxim este "+ nrMax);

        //pr2, calculam numarul minim din array
        int nrMin = array[0];

        for ( int j : array)
        {
            if ( j < nrMin)
                nrMin = j;
        }
        System.out.println("Nr minim este "+ nrMin);

        //pr3, calculam suma numerelor si scadem numarul minim din ea
        int sum = 0;
        for (int j : array)
        {
            sum += j;
        }
        System.out.println("Suma maxima a n-1 elemente este "+ (sum-nrMin));

        //pr4, calculam suma numerelor si scadem numarul maxim din ea
        System.out.println("Suma minima a n-1 elemente este "+ (sum-nrMax));
    }

}
