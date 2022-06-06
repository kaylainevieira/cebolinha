package br.com.triersistemas.cebolinha.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica {

	private List<String> ofertasDoDia;

	public Farmaceutico(List<String> ofertaDoDia) {
		List<String> ofertasDoDia = new ArrayList<String>();
		ofertasDoDia.add("Aciclovir por R$12,00");
		ofertasDoDia.add("Bisoprolol por R$30,00");
		ofertasDoDia.add("Capecitabina por R$18,00");
		ofertasDoDia.add("Deferiprona por R$22,00");
		ofertasDoDia.add("Emicizumabe por R$7,20");
		ofertasDoDia.add("Flurbiprofeno por R$10,00");
		ofertasDoDia.add("Gemifloxacino por R$24,00");
		ofertasDoDia.add("Ibritumomabe por R$32,45");
		ofertasDoDia.add("Lasmiditana por R$50,00");
		ofertasDoDia.add("Lurasidona por R$32,99");
		ofertasDoDia.add("Micafungina por R$27,50");

		SplittableRandom r = new SplittableRandom();
		
		for (int i = 0; i < r.nextInt(0, ofertaDoDia.size()); i ++) {
			var p = ofertaDoDia.get(r.nextInt(0, ofertasDoDia.size()));
			this.ofertasDoDia = ofertaDoDia;
		}
	}

	public List<String> getOfertaDoDia() {

		return ofertasDoDia;
	}
}
