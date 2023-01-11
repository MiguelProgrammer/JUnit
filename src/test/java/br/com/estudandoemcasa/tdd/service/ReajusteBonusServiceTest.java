package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class ReajusteBonusServiceTest {

    @Test
    void reajusteTresPorCento(){
        ReajusteService reajusteService = new ReajusteService();
        BigDecimal salario = new BigDecimal("6000");
        Funcionario funcionario = new Funcionario("Miguel", LocalDate.now(), salario);
        reajusteService.reajusta(funcionario, Desempenho.FRACO);
        Assertions.assertEquals(salario.add(new BigDecimal("180.0").setScale(2)), funcionario.getSalario());
    }
}