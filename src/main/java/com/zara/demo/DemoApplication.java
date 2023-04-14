package com.zara.demo;

import com.zara.demo.config.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/** @author LD */
@SpringBootApplication
public class DemoApplication {
	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) throws UnknownHostException {

		SpringApplication app = new SpringApplication(DemoApplication.class);
		ConfigurableApplicationContext applicationContext = app.run(args);
		Environment env = applicationContext.getEnvironment();

		String protocolHttp = Constants.SPRING_HTTP_PROTOCOL;
		String serverPort = env.getProperty(Constants.SPRING_PROPERTY_PORT);

		logger.info(
				Constants.SPRING_INFO,
				env.getProperty(Constants.SPRING_PROPERTY_ENV),
				protocolHttp,
				serverPort,
				protocolHttp,
				InetAddress.getLocalHost().getHostAddress(),
				serverPort,
				serverPort);
	}

}
