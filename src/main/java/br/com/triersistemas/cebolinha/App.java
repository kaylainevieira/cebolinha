package br.com.triersistemas.cebolinha;

import java.util.Scanner;
import java.util.SplittableRandom;

public class App {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcaoDigitada = 0;
        do {

            System.out.println("Informe: "
                    + "\n1 - gerar cpf valido."
                    + "\n2 - validar cpf."
                    + "\n3 - gerar cnpj."
                    + "\n4 - validar cnpj."
                    + "\n0 - sair.");
            opcaoDigitada = sc.nextInt();

            if (opcaoDigitada == 1) {
                String cpfGerado = gerarCnpj();
                System.out.println(criarMensagem(validarCpf(cpfGerado), cpfGerado, "cpf"));

            } else if (opcaoDigitada == 2) {
                System.out.println("Informe um cpf:");
                String cpfDigitado = sc.next();
                System.out.println(criarMensagem(validarCpf(cpfDigitado), cpfDigitado, "cpf"));

            } else if (opcaoDigitada == 3) {
                String cnpjGerado = gerarCnpj();
                System.out.println(criarMensagem(validarCpf(cnpjGerado), cnpjGerado, "cnpj"));

            } else if (opcaoDigitada == 4) {
                System.out.println("Informe um cnpj.");
                String cnpjDigitado = sc.next();
                System.out.println(criarMensagem(validarCpf(cnpjDigitado), cnpjDigitado, "cnpj"));

            }

        } while (opcaoDigitada != 0);

        sc.close();

    }

//    public static String tirarMascara(String cpf) {
//        
//        if (cpf.matches())
//        
//        return cpf;
//    }

    public static String validarCpf(String cpf) {
        int numeroFinal = 0;
        String numerosFinais = "";
        int soma = 0;
        int multiplicador = 1;
        char[] caracteresCpf = cpf.toCharArray();
        int j = 0;
        int iguais = 0;

        for (int i = 0; i < 9; i++) {

            int numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            soma = soma + (numero * multiplicador);
            multiplicador++;

            if (iguais != numero) {
                iguais = numero;
            } else {
                iguais = numero;
                j++;
            }

            if (j == 8) {
                return "Não";
            }
        }

        numeroFinal = soma % 11;
        
//        if (numeroFinal > 9 || numeroFinal < 3) {
//            numeroFinal = 0;
//        }
        
        numerosFinais = "" + numeroFinal;

        multiplicador = 0;
        soma = 0;

        for (int i = 0; i <= 9; i++) {

            int numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            soma = soma + (numero * multiplicador);
            multiplicador++;
        }

        numeroFinal = soma % 11;
        
//        if (numeroFinal > 9 || numeroFinal < 3) {
//            numeroFinal = 0;
//        }
        
        numerosFinais = numerosFinais + numeroFinal;

        String a = "" + caracteresCpf[9] + caracteresCpf[10];

        if (numerosFinais.equals(a)) {
            return "Sim";
        }

        return "Não";
    }

    public static String gerarCpf() {

        String cpf = "";
        for (int i = 0; i < 9; i++) {

            SplittableRandom r = new SplittableRandom();
            cpf = cpf + r.nextInt(9);
        }

        int soma = 0;
        int multiplicador = 1;
        char[] arrayCpf = cpf.toCharArray();
        char[] caracteresCpf = new char[11];

        for (int i = 0; i < 9; i++) {

            Integer numero = Integer.valueOf(String.valueOf(arrayCpf[i]));

            soma = soma + (numero * multiplicador);
            multiplicador++;
            caracteresCpf[i] = arrayCpf[i];
        }

        cpf = cpf + soma % 11;
        caracteresCpf[9] = cpf.charAt(9);

        multiplicador = 0;
        soma = 0;

        for (int i = 0; i <= 9; i++) {

            Integer numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            soma = soma + (numero * multiplicador);
            multiplicador++;
        }

        cpf = cpf + soma % 11;

        return cpf;
    }

    public static String gerarCnpj() {

        String cnpj = "";
        for (int i = 0; i < 12; i++) {

            SplittableRandom r = new SplittableRandom();
            cnpj = cnpj + r.nextInt(9);
        }

        int soma = 0;

        char[] arrayCpf = cnpj.toCharArray();
        char[] caracteresCpf = new char[14];
        int multiplicador = 6;
        int j = 2;

        for (int i = 0; i < 12; i++) {

            Integer numero = Integer.valueOf(String.valueOf(arrayCpf[i]));

            if (multiplicador >= 2) {
                soma = soma + (numero * multiplicador);
                multiplicador--;
            } else {
                soma = soma + (numero * j);
                j++;
            }
            caracteresCpf[i] = arrayCpf[i];
        }

        cnpj = cnpj + soma % 11;
        caracteresCpf[12] = cnpj.charAt(12);

        multiplicador = 7;
        j = 2;
        soma = 0;

        for (int i = 0; i <= 12; i++) {

            Integer numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            if (multiplicador >= 2) {
                soma = soma + (numero * multiplicador);
                multiplicador--;
            } else {
                soma = soma + (numero * multiplicador);
                j++;
            }
        }

        cnpj = cnpj + soma % 11;

        return cnpj;
    }

    public static String validarCnpj(String cnpj) {
        int soma = 0;
        int multiplicador = 5;
        char[] caracteresCpf = cnpj.toCharArray();
        int j = 9;
        String numerosFinais = "";

        for (int i = 0; i < 12; i++) {

            Integer numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            if (multiplicador >= 2) {
                soma = soma + (numero * multiplicador);
                multiplicador--;
            } else {
                soma = soma + (numero * j);
                j--;
            }
        }

        numerosFinais = "" + soma % 11;

        multiplicador = 6;
        j = 9;
        soma = 0;

        for (int i = 0; i <= 12; i++) {

            Integer numero = Integer.valueOf(String.valueOf(caracteresCpf[i]));

            if (multiplicador >= 2) {
                soma = soma + (numero * multiplicador);
                multiplicador--;
            } else {
                soma = soma + (numero * j);
                j--;
            }
        }

        numerosFinais = numerosFinais + soma % 11;

        String a = "" + caracteresCpf[12] + caracteresCpf[13];

        if (numerosFinais.equals(a)) {
            return "Sim";
        }

        return "Não";
    }

    public static String criarMensagem(String isValido, String documento, String tipoDocumento) {
        String mensagem = "+";
        for (int i = 0; i < (documento.length() + "|Válido:".length()); i++) {
            mensagem = mensagem + "-";
        }
        mensagem = mensagem + "+" + "\n|Válido: " + isValido;

        for (int i = 0; i < (documento.length() - "Sim".length()); i++) {
            mensagem = mensagem + " ";
        }

        mensagem = mensagem + "|";

        if (tipoDocumento.equalsIgnoreCase("cpf")) {
            mensagem = mensagem + "\n|CPF...: " + documento + "|\n+";
        } else if (tipoDocumento.equalsIgnoreCase("cnpj")) {
            mensagem = mensagem + "\n|CNPJ..: " + documento + "|\n+";
        }

        for (int i = 0; i < (documento.length() + "|Válido:".length()); i++) {
            mensagem = mensagem + "-";
        }
        mensagem = mensagem + "+";

        return mensagem;
    }
}

