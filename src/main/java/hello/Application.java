package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class is the main application class that modifies Spring sample
 * "hello world" RESTful web service with Spring Boot Actuator. 
 * You’ll build a service that accepts an HTTP GET request
 * @author kenny edmond
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	/**
	 * This method is the main method that runs the Spring application
	 * @param args - String[]
	 */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

} 