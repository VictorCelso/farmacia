package model;

import java.time.LocalDate;
import java.util.Random;

public abstract class Produto {
    private int id;
    private String descricao;
    private int estoque;
    private double preco;
    private LocalDate validade;
    private int descontoMax;
    private String fornecedor;

    public Produto(int id, String descricao, int estoque, double preco, LocalDate validade, int descontoMax, String fornecedor) {
        this.fornecedor = fornecedor;
        this.id = new Random().nextInt();
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
        this.validade = validade;
        this.descontoMax = descontoMax;
    }

    public Produto() {

    }

    public int getDescontoMax() {
        return descontoMax;
    }

    public void setDescontoMax(int descontoMax) {
        this.descontoMax = descontoMax;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
