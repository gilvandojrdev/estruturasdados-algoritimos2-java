package br.com.estruturadados.Entitites;

public class Vetor {

    private String[] elementos;
    private int tamanho;



    public Vetor(int capacidadeElementos){
        this.elementos = new String[capacidadeElementos];
        this.tamanho = 0;
    }

//    public void adicionarElemento(String elemento){
//        for (int i = 0; i < this.elementos.length; i++) {
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

    public void adicionarElemento(String elemento) throws Exception{

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor está cheio não é possivel adicionar mais elementos");
        }

    }

}
