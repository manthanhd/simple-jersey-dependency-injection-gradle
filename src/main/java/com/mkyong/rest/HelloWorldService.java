package com.mkyong.rest;
 
import com.sun.jersey.api.core.InjectParam;
import com.sun.jersey.spi.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {

	@InjectParam
	private NewService newService;

	@GET
	@Path("/")
	public Response getMsg() {
		String output = newService.hello();
		output = "Dependency injection is " + output;
		System.out.println("Service works!");
		return Response.status(200).entity(output).build();
	}
 
}