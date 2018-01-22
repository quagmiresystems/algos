package com.quagmiresystems.algos;

public class RecursiveBinSearcher implements BinSearcher {

    @Override
    public boolean contains(int[] ints, int target) {
        return contains(ints, 0, ints.length - 1, target);
    }

    private boolean contains(int[] ints, int minIndex, int maxIndex, int target) {
        int midIndex = (maxIndex - minIndex) / 2 + minIndex;
        int midValue = ints[midIndex];
        System.out.println("minIndex: " + minIndex + " ~ midIndex: " + midIndex + " ~ maxIndex: " + maxIndex);
        if (minIndex == maxIndex) {
            return ints[minIndex] == target;
        } else {
            if (midValue == target) {
                return true;
            } else if (midValue>target) {
                return contains(ints, minIndex, midIndex - 1, target);
            } else {
                return contains(ints, midIndex + 1, maxIndex, target);
            }
        }
    }

}
