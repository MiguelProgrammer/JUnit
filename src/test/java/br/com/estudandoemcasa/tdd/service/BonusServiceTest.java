package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class BonusServiceTest {

    @Test
    void resultSoma(){
        BonusService bonusService = new BonusService();
        Funcionario funcionario = new Funcionario("Miguel", LocalDate.now(), new BigDecimal("600000"));
        BigDecimal bonus = bonusService.calcularBonus(funcionario);
        Assertions.assertEquals(new BigDecimal("0.0"), bonus);
    }
}