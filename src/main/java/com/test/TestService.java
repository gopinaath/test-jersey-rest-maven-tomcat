package com.test;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/**
 * @author naveenvemulapalli
 *  Blog: https://dzone.com/articles/rest-webservices-using-jersey-2x-and-maven-1
 *  
 *  Test URL : http://localhost:8080/test-jersey-rest-maven-tomcat/rest/testservice
 *  
 *  WADL URL: http://localhost:8080/test-jersey-rest-maven-tomcat/rest/application.wadl
 */
@Path("/testservice")
public class TestService {
 
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getTestService() {
	  System.out.println("From the console");
    return "Hello World! This is coming from webservice!!";
  }
  
}