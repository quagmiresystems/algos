package com.quagmiresystems.algos;

import java.util.Arrays;


public class Main {
        
    public static void main(String[] args) {
        int[] ints = new int[]{ 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 65, 70, 75, 80, 90 };
        BinSearcher ibs = new IterativeBinSearcher();
        print(ints, 50, ibs);
        print(ints, 60, ibs);
        BinSearcher rbs = new RecursiveBinSearcher();
        print(ints, 50, rbs);
        print(ints, 60, rbs);
    }
    
    private static void print(int[] ints, int target, BinSearcher bs) {
        System.out.println(Arrays.toString(ints) + " contains " + target + "? " + bs.contains(ints, target));
    }

}
