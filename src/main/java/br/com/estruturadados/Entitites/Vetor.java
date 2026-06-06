package br.com.estruturadados.Entitites;

public class Vetor {

    private String[] elementos;

    public Vetor(int capacidadeElementos){
        this.elementos = new String[capacidadeElementos];
    }

    public void adicionarElemento(String elemento){
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}
