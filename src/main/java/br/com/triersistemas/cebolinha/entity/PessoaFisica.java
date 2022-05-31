package br.com.triersistemas.cebolinha.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class PessoaFisica extends Pessoa{

	@Override
	public String getDocumento() {
		
		List<String> cpfs = new ArrayList<String>();
		cpfs.add("078.603.280-46");
		cpfs.add("287.205.580-07");
		cpfs.add("769.707.150-94");
		cpfs.add("319.437.210-68");
		cpfs.add("803.833.750-61");
		cpfs.add("560.660.960-60");
		cpfs.add("011.407.050-40");
		cpfs.add("298.932.970-60");
		cpfs.add("881.175.130-64");
		cpfs.add("732.088.780-01");
		cpfs.add("898.136.750-71");
		
		SplittableRandom r = new SplittableRandom();
		
        return cpfs.get(r.nextInt(0, cpfs.size()));
	}
}
