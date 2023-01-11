package br.com.estudandoemcasa.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
    FRACO {
        @Override
        BigDecimal reauste() {
            return new BigDecimal("0.03");
        }
    };

    abstract BigDecimal reauste();
}
