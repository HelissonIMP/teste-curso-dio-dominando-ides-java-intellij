package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 4 ;
        System.out.println("Hello World! " + (a + b));*/
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("As 46 leis do poder",  300);
        System.out.println(livro1);
    }
}
class Livros {
    private String nome;
    private Integer numPaginas;

    public Livros(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

