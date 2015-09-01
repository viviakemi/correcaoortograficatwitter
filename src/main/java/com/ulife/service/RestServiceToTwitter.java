package com.ulife.service;

import java.io.IOException;

import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;



public class RestServiceToTwitter {

	
	public RestServiceToTwitter() throws IOException{
	}
	
	public ParameterResponse sendToTwitter(final ParameterTimeRequest parameterTimeRequest){

	    
		try {
			
			TwitterStream twitterStreamBH = new TwitterStreamFactory().getInstance();
			StatusListenerBH statusBH = new StatusListenerBH();
			twitterStreamBH.addListener(statusBH);

			FilterQuery filterBH = new FilterQuery();
			
			//problema no location
			filterBH.locations(new double[][]{new double[]{-19.8157, -43.9542},
	                });

			filterBH.language(new String[]{"pt"});
			filterBH.track(new String[]{"a"});
			twitterStreamBH.filter(filterBH);
			
			
			TwitterStream twitterStreamRJ = new TwitterStreamFactory().getInstance();
			StatusListenerRJ statusRJ = new StatusListenerRJ();
			twitterStreamRJ.addListener(statusRJ);

			FilterQuery filterRJ = new FilterQuery();
			
			//problema no location
			filterRJ.locations(new double[][]{new double[]{-22.9035, -43.2096
	                }});
			
			filterRJ.track(new String[]{"a"});
			filterRJ.language(new String[]{"pt"});
			twitterStreamRJ.filter(filterRJ);
			
			long inicio = System.currentTimeMillis();
			while (System.currentTimeMillis() - inicio < parameterTimeRequest.getTime()*1000){
				
			}

			twitterStreamBH.clearListeners();
			twitterStreamBH.cleanUp();
			twitterStreamRJ.clearListeners();
			twitterStreamRJ.cleanUp();
			return new ParameterResponse(statusBH.getBH(),statusRJ.getRJ(),
					((statusBH.getBH()>statusRJ.getRJ())?"bh":
						((statusRJ.getRJ()>statusBH.getBH())?"rj":"")));

		} catch (Exception e) {

			e.printStackTrace();

		}
		return new ParameterResponse(0,0,"");
	}
}
