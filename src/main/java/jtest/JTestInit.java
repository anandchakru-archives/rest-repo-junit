package jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JTestInit {
	private static final Logger logger = LoggerFactory.getLogger("jtest");

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Config.class, args);
		logger.debug("Initialized CifiCore.");
	}
}