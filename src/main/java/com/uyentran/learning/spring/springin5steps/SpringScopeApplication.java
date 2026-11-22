package com.uyentran.learning.spring.springin5steps;

import com.uyentran.learning.spring.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	static void main(String[] args) {

		try (var applicationContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class)) {

			var personDao = applicationContext.getBean(PersonDAO.class);

			var personDao2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao.getJdbcConnection());

			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao.getJdbcConnection());
		}
	}

}
