package com.uyentran.learning.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {1, 5}, 5);
		System.out.println(result);

//		SpringApplication.run(Application.class, args);
	}

}
