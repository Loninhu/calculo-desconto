package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Venda {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private DescontoStrategy descontoStrategy;

    public Venda(Cliente cliente, LocalDate data, double valorTotal, DescontoStrategy descontoStrategy) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        this.descontoStrategy = descontoStrategy;
    }

    public double aplicarDesconto() {
        return descontoStrategy.calcularDesconto(this);
    }

    public double getValorComDesconto() {
        return valorTotal - aplicarDesconto();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
}
