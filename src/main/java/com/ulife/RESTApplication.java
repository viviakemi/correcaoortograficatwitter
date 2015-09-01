package com.ulife;

import java.util.HashSet;
import java.util.Set;

import com.ulife.service.RestService;

public class RESTApplication extends javax.ws.rs.core.Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RESTApplication () {
		singletons.add(new RestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}