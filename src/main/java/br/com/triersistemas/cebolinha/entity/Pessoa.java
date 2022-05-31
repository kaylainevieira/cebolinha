package br.com.triersistemas.cebolinha.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoa {

	private String nome;
	
	public Pessoa() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Bianca");
		nomes.add("Vitória");
		nomes.add("Caethana");
		nomes.add("Kay");
		nomes.add("Amanda");
		nomes.add("Carol");
		nomes.add("Davi");
		nomes.add("Igor");
		nomes.add("Antônio");
		nomes.add("Edymar");
		nomes.add("Edward");
		
		SplittableRandom r = new SplittableRandom();
		this.nome = nomes.get(r.nextInt(0, nomes.size()));
	}

	public String getNome() {
		return nome;
	}

	public abstract String getDocumento();	
}
