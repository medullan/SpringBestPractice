package hello;


import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class HelloWorldControllerTest extends TestCase {
	private MockMvc mockMvc;
	
@Before
public void setup(){
	mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
}
	  /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	public HelloWorldControllerTest(String testName){
		super(testName);
	}

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	given().
    	standaloneSetup(new HelloWorldController()).
    	param("name", "Kenny Edmond").
    when().
    	get("/hello-world").
    then().
    	statusCode(200);
        assertTrue(true);
    }
	
	

}
