package com.ulife.service;

public class ParameterResponse {

	private int bh;
	private int rio;
	private String winner;

	public ParameterResponse(){

	}

	public ParameterResponse(int bh, int rio, String winner){
		this.bh = bh;
		this.rio = rio;
		this.winner = winner;
	}

	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}

	public int getRio() {
		return rio;
	}

	public void setRio(int rio) {
		this.rio = rio;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

}
