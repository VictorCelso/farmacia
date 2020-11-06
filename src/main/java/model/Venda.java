package model;

import java.util.List;

public class Venda {
    private String cpfCliente;
    private List<Produto> produtos;
    private double total;

    public Venda(String cpfCliente, List<Produto> produtos, double total) {
        this.cpfCliente = cpfCliente;
        this.produtos = produtos;
        this.total = total;
    }

    public Venda() {

    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
