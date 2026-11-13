package com.uyentran.learning.spring;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int target) {

        // Sort the array
        int[] sortedNumbers = sortAlgorithm.sort(new int[] {1, 2, 5, 4, 3});
        System.out.println(sortAlgorithm);

        // Search the array

        return 1;
    }
}
