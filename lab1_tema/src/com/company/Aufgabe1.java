package com.company;

import java.util.*;

public class Aufgabe1 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of arrays: ");
        n = s.nextInt();
        int[] m = new int[n];
        System.out.println("Enter elements of the first array: ");
        for (int i = 0; i < n; i++) {
            m[i] = s.nextInt();
        }

        System.out.println(pr1(m));
        System.out.println(pr2(m));
        System.out.println(pr3(m));
        System.out.println(pr4(m));
    }

    private static ArrayList<Integer> pr1(int[] noten) {
        List<Integer> newarray = new ArrayList<Integer>();
        for (int i : noten) {
            if (i < 38) {
                newarray.add(i);
            }
        }
        return (ArrayList<Integer>) newarray;
    }

    private static double pr2(int[] noten) {
        double durchschnitt;
        int summe = 0;
        for (int i : noten) {
            summe = summe + i;
        }
        durchschnitt = (double) summe / noten.length;
        return durchschnitt;
    }

    private static ArrayList<Integer> pr3(int[] noten){
        List<Integer> newarray = new ArrayList<Integer>();
        for (int i : noten) {
            if (i < 38 | ((i/5+1)*5-i)>=3 | i%5==0) {
                newarray.add(i);
            }
            else
            {
                newarray.add((i/5+1)*5);
            }
        }
        return (ArrayList<Integer>) newarray;
    }

    private static int pr4(int[] noten){
        ArrayList<Integer> newarray = pr3(noten);
        int max = newarray.get(0);
        for(int i:newarray){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}