package com.uyentran.learning.spring.springin5steps;

import com.uyentran.learning.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringComponentScanApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

	static void main(String[] args) {

		try (var applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApplication.class)) {

			var componentDao = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDao);
		}
	}

}
