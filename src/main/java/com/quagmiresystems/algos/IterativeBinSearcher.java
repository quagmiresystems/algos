package com.quagmiresystems.algos;

import java.util.Arrays;


public class IterativeBinSearcher implements BinSearcher {
    
    @Override
    public boolean contains(int[] ints, int target) {
        int minIndex = 0;
        int maxIndex = ints.length-1;
        while(minIndex<maxIndex) {
            int midIndex = (maxIndex-minIndex)/2 + minIndex;
            int midValue = ints[midIndex];
            System.out.println("minIndex: " + minIndex + " ~ midIndex: " + midIndex + " ~ maxIndex: " + maxIndex);
            if(midValue==target) {
                return true;
            } else if(target<midValue){
                maxIndex = midIndex - 1;
            } else {
                minIndex = midIndex + 1;
            }
        }
        return false;
    }

}
