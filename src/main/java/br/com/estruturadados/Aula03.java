package br.com.estruturadados;

import br.com.estruturadados.Entitites.Vetor;

public class Aula03 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("elemento01");
        vetor.adicionarElemento("elemento02");
        vetor.adicionarElemento("elemento03");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);

    }
}
