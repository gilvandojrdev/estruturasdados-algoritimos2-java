package br.com.estruturadados;

import br.com.estruturadados.Entitites.Vetor;

public class Aula04 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("elemento01");
        vetor.adicionarElemento("elemento02");
        vetor.adicionarElemento("elemento03");

        System.out.println(vetor.buscarElemento(0));

    }
}
