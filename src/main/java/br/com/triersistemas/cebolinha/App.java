package br.com.triersistemas.cebolinha;

import br.com.triersistemas.cebolinha.entity.Farmaceutico;
import br.com.triersistemas.cebolinha.entity.Fornecedor;

public class App {

    public static void main(String[] args) {

        Farmaceutico novoFarmaceutico = new Farmaceutico();

        Fornecedor novoFornecedor = new Fornecedor();

        System.out.printf("""
                        Nome farmaceutico: %s
                        Cpf: %s
                        Oferta do dia: %s
                        """,
                novoFarmaceutico.getNome(),
                novoFarmaceutico.getDocumento(),
                novoFarmaceutico.getOfertaDoDia());
        
        System.out.println("");
        
        System.out.printf("""
                      Nome fornecedor: %s
                      Cnpj: %s
                      Produto: %s
                      """,
                novoFornecedor.getNome(),
                novoFornecedor.getDocumento(),
                novoFornecedor.getProduto());

    }
}
