package com.uyentran.learning.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private final SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(@Qualifier("quick-sort") SortAlgorithm sortAlgorithm) {
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
