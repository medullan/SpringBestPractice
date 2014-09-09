package hello.util;

import hello.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * This is a sample util class
 * @author kennyedmond
 *
 */
public class ParseGreeting {

	private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    /**
     * This is a sample util method that generates greeting
     * @param name
     * @return formatted greeting
     */
    public static Greeting GenerateGreeting(String name){
    	return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
