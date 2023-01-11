package br.com.estudandoemcasa.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
    FRACO {
        @Override
        BigDecimal reajuste() {
            return new BigDecimal("0.03");
        }
    },
    MEDIO {
        @Override
        BigDecimal reajuste() {
            return new BigDecimal("0.04");
        }
    },
    FORTE {
        @Override
        BigDecimal reajuste() {
            return new BigDecimal("0.05");
        }
    };

    abstract BigDecimal reajuste();
}
