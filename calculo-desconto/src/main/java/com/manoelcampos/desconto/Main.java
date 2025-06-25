package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Ian Moraes", LocalDate.of(2002, 11, 21));
        Venda venda = new Venda(cliente, LocalDate.now(), 500.0, new DescontoPercentual(10));


        System.out.println("Valor total da venda: R$ " + venda.getValorTotal());

        System.out.println("Desconto Percentual:");
        System.out.println("Valor com desconto percentual: R$ " + venda.getValorComDesconto());
        System.out.println("---------------------------------------");

        System.out.println("Desconto Progressivo:");
        venda.setDescontoStrategy(new DescontoProgressivo());
        System.out.println("Valor com desconto progressivo: R$ " + venda.getValorComDesconto());
        System.out.println("---------------------------------------");

        System.out.println("Desconto de Aniversário:");
        venda.setDescontoStrategy(new DescontoAniversario());
        System.out.println("Valor com desconto de aniversário: R$ " + venda.getValorComDesconto());
        System.out.println("---------------------------------------");
    }
}
