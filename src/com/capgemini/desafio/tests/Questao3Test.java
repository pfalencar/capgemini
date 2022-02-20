package com.capgemini.desafio.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao3;

public class Questao3Test {
	
	@Test
	public void ifailuhkqqDeveriaContarQtdParesAnagramas() {
		Questao3 questao3 = new Questao3();
		int qtdAnagramas = questao3.calcularQtdParesAnagramas("ifailuhkqq");
		
		Assert.assertEquals(3, qtdAnagramas);
	}

	@Test
	public void ovoDeveriaContarQtdParesAnagramas() {
		Questao3 questao3 = new Questao3();
		int qtdAnagramas = questao3.calcularQtdParesAnagramas("ovo");
		
		Assert.assertEquals(2, qtdAnagramas);
	}
}
