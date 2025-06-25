package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoAniversario implements DescontoStrategy {

    @Override
    public double calcularDesconto(Venda venda) {
        Cliente cliente = venda.getCliente();
        LocalDate hoje = LocalDate.now();
        if (cliente.getDataNascimento().getDayOfMonth() == hoje.getDayOfMonth() &&
                cliente.getDataNascimento().getMonth() == hoje.getMonth()) {
            return venda.getValorTotal() * 0.15;
        }
        return 0;
    }
}
