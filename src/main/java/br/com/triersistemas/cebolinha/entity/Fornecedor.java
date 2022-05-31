package br.com.triersistemas.cebolinha.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica {

    private String produto;

    public String getProduto() {

        List<String> nomes = new ArrayList<String>();
        nomes.add("Televisão");
        nomes.add("Cama");
        nomes.add("Cafeteira");
        nomes.add("Batedeira");
        nomes.add("Panela");
        nomes.add("Computador");
        nomes.add("Fone de ouvido");
        nomes.add("Máquina de lavar");
        nomes.add("DVD");
        nomes.add("Notebook");
        nomes.add("Mesa");

        SplittableRandom r = new SplittableRandom();
        return nomes.get(r.nextInt(0, nomes.size()));
    }
}
