package com.magalu.magaapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    String nome;
    String quant;
    double preco;

    public Produto(DadosCadastraProd dados){
        this.nome = dados.nome();
        this.quant = dados.quant();
        this.preco = dados.preco();
    }

    public Produto(){}

    @Override
    public String toString(){
        return "Produto ["
        + "nome=" + nome + ", "
				+ "quant=" + quant + ", "
				+ "preco=" + preco + ""
				+ "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void atualizaDados(DadosCadastraProd dados){
        this.nome = dados.nome();
        this.quant = dados.quant();
        this.preco = dados.preco();

    }
}
