package com.ulife.service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class RESTEasyClient {
	
	
	
	public static void main(String[] args) {


		try {
			
			
			ResteasyClient client = new ResteasyClientBuilder().build();
			
			ResteasyWebTarget target = client
					.target("http://localhost:8080/teste_vivi/rest/jsonServices/send");

			Response response = target.request().post(
					Entity.entity(new ParameterTimeRequest(Integer.parseInt(args[0])), "application/json"));

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Server response : \n");
			System.out.println(response.readEntity(String.class));

			response.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
