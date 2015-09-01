package com.ulife.service;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/jsonServices")
public class RestService {

	@GET
	@POST
	@Path("/send")
	@Consumes("application/json")
	public Response consumeJSON(final ParameterTimeRequest parameterTimeRequest) throws IOException {

		
		return Response.status(200).entity(new RestServiceToTwitter().
				sendToTwitter(parameterTimeRequest)).build();
	}
}
