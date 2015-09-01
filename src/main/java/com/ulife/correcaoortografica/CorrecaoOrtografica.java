package com.ulife.correcaoortografica;

import com.atlascopco.hunspell.Hunspell;


public final class CorrecaoOrtografica {
	
	private Hunspell hunspell;
	
	public CorrecaoOrtografica(final Hunspell hunspell){
		this.hunspell = hunspell;
	}
	

	public int contarErrosOrtograficos(final String frase){
		try{

			String[] palavras = frase.split(" ");
			int contErro = 0;
			
			for (String palavra: palavras){
				if (!hunspell.isCorrect(palavra)){
					contErro++;
				}
			}
			
			return contErro;
			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}
