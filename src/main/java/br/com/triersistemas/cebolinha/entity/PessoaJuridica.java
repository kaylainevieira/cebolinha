package br.com.triersistemas.cebolinha.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class PessoaJuridica extends Pessoa{

	@Override
	public String getDocumento() {
		List<String> cnpjs = new ArrayList<String>();
		cnpjs.add("30.287.155/0001-11");
		cnpjs.add("74.232.456/0001-13");
		cnpjs.add("78.864.443/0001-22");
		cnpjs.add("84.865.203/0001-30");
		cnpjs.add("50.284.844/0001-80");
		cnpjs.add("12.407.640/0001-08");
		cnpjs.add("57.669.644/0001-94");
		cnpjs.add("87.673.078/0001-55");
		cnpjs.add("87.379.248/0001-93");
		cnpjs.add("79.237.834/0001-75");
		cnpjs.add("26.291.671/0001-42");
		
		SplittableRandom r = new SplittableRandom();
		
        return cnpjs.get(r.nextInt(0, cnpjs.size()));
	}

}
