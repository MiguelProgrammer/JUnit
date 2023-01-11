package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;

import static java.lang.Boolean.*;

public class ReajusteService {
    public void reajusta(Funcionario funcionario, Desempenho desempenho) {
        for (var atuacao : Desempenho.values()) {
            if(atuacao.equals(desempenho)){
                funcionario.ajutaSalario(funcionario.getSalario().multiply(desempenho.reajuste()));
            }
        }
    }
}
