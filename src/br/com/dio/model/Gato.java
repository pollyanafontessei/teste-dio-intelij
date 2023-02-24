package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private String idadde;


    public Gato() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idadde, gato.idadde);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idadde);
    }

    public Gato(String nome, String cor, String idadde) {
        this.nome = nome;
        this.cor = cor;
        this.idadde = idadde;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdadde() {
        return idadde;
    }

    public void setIdadde(String idadde) {
        this.idadde = idadde;
    }
}
}

