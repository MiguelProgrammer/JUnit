package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void reajusta(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho == Desempenho.FRACO){
           funcionario.ajutaSalario(funcionario.getSalario().multiply(desempenho.reauste()));
        }
    }
}
