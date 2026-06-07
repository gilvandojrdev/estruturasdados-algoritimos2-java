package br.com.estruturadados;

import br.com.estruturadados.Entitites.Vetor;

public class Aula06 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionarElemento("B");
        vetor.adicionarElemento("C");
        vetor.adicionarElemento("E");
        vetor.adicionarElemento("F");
        vetor.adicionarElemento("G");

        System.out.println(vetor);

        vetor.adicionarElemento(0, "A");

        System.out.println(vetor);

        vetor.adicionarElemento(3, "D");

        System.out.println(vetor);

    }
}
