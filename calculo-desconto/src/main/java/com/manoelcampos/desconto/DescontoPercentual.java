package com.manoelcampos.desconto;

public class DescontoPercentual implements DescontoStrategy {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcularDesconto(Venda venda) {
        return venda.getValorTotal() * (percentual / 100);
    }
}
