package com.ulife.correcaoortografica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atlascopco.hunspell.Hunspell;


public class CorrecaoOrtograficaTest {


	private static Hunspell configurarHunspell() throws FileNotFoundException, IOException{


		Properties prop = new Properties();
		prop.load(CorrecaoOrtograficaTest.class.getResourceAsStream("config.prop"));
		/*String dicPath = new File(CorrecaoOrtograficaTest.class.getResource("pt-BR.dic")
					.toURI()).getAbsolutePath();
			String affPath = new File(CorrecaoOrtograficaTest.class.getResource("pt-BR.aff")
					.toURI()).getAbsolutePath();*/
		return new Hunspell(prop.getProperty("dicPath"), prop.getProperty("affPath"));


	}

	public static void main(String[] args) throws FileNotFoundException, IOException{


		if (args != null && args.length > 0){
			CorrecaoOrtografica correcaoOrtografica = new CorrecaoOrtografica(configurarHunspell());
			System.out.println(correcaoOrtografica.contarErrosOrtograficos(args[0]));
		}else{
			System.out.println("\n Palavra não informada.");
		}

	}
}
