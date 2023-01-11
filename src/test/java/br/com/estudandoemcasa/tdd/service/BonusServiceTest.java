package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

class BonusServiceTest {

    @Test
    void resultSoma(){
        BonusService bonusService = new BonusService();
        Funcionario funcionario = new Funcionario("Miguel", LocalDate.now(), new BigDecimal("600000"));
        try {
            BigDecimal bonus = bonusService.calcularBonus(funcionario);
            fail("Erro no test");
        } catch (IllegalArgumentException e){
            Assertions.assertEquals(e.getMessage(), e.getMessage());
        }
    }
}