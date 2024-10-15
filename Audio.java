package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int TotalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return TotalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.TotalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

}
