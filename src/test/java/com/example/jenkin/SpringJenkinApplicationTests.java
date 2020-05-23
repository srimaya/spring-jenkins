package com.example.jenkin;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class SpringJenkinApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		Assert.doesNotContain("Test", "daf");
		logger.info("Execute successfully..");
	}

}
