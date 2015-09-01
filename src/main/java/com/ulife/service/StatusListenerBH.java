package com.ulife.service;

import java.io.IOException;
import java.util.Properties;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

import com.atlascopco.hunspell.Hunspell;
import com.ulife.correcaoortografica.CorrecaoOrtografica;

public class StatusListenerBH implements StatusListener{

	private CorrecaoOrtografica correcaoOrtografica;
	private int bh;
	
	private Hunspell configurarHunspell() throws IOException{

		Properties prop = new Properties();
		prop.load(CorrecaoOrtografica.class.getResourceAsStream("config.prop"));

		return new Hunspell(prop.getProperty("dicPath"), prop.getProperty("affPath"));

	}
	
	
	public StatusListenerBH() throws IOException {
		
		this.correcaoOrtografica = new CorrecaoOrtografica(configurarHunspell());
	}
	
	@Override
	public void onException(Exception ex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatus(Status status) {
		System.out.println(status.getUser().getName() + " : " + status.getText());
        if (this.correcaoOrtografica.contarErrosOrtograficos(status.getText()) > 0){
        	bh++;
        }
		
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScrubGeo(long userId, long upToStatusId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStallWarning(StallWarning warning) {
		// TODO Auto-generated method stub
		
	}
	
	public int getBH(){
		return this.bh;
	}

}
