package br.com.estudandoemcasa.tdd.service;

import br.com.estudandoemcasa.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class ReajusteBonusServiceTest {
    private ReajusteService reajusteService;
    private Funcionario funcionario;
    private BigDecimal salario;

    @BeforeEach
    void inicializa(){
        this.reajusteService = new ReajusteService();
        this.salario = new BigDecimal("6000").setScale(2);
        this.funcionario = new Funcionario("Miguel", LocalDate.now(), salario);
    }
    @Test
    void reajusteTresPorCento(){
        reajusteService.reajusta(funcionario, Desempenho.FRACO);
        Assertions.assertEquals(salario.add(new BigDecimal("180.0")), funcionario.getSalario());
    }
    @Test
    void reajusteQuatroPorCento(){
        reajusteService.reajusta(funcionario, Desempenho.MEDIO);
        Assertions.assertEquals(salario.add(new BigDecimal("260.0").setScale(2)), funcionario.getSalario());
    }
    @Test
    void reajusteCincoPorCento(){
        reajusteService.reajusta(funcionario, Desempenho.FORTE);
        Assertions.assertEquals(salario.add(new BigDecimal("300.0").setScale(2)), funcionario.getSalario());
    }
}