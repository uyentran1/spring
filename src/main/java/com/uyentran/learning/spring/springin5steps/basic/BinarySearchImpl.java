package com.uyentran.learning.spring.springin5steps.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }
}
