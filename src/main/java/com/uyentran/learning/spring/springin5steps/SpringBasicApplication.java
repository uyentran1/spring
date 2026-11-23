package com.uyentran.learning.spring.springin5steps;

import com.uyentran.learning.spring.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.uyentran.learning.spring")
public class SpringBasicApplication {
	// We need to tell Spring 3 things:
	// What are the beans? --> We add @Component
	// What are the dependencies of a bean? --> We add @Autowired
	// Where to search for beans? --> Spring will scan the package and sub-packages
	// where @SpringBootApplication is in => So no need for this package

	static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Beans are created and managed by ApplicationContext
		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {1, 5}, 5);
		System.out.println(result);

	}

}
