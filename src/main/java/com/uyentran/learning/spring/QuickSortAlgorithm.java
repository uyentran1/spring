package com.uyentran.learning.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick-sort")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for quick sort...
        return numbers;
    }
}
