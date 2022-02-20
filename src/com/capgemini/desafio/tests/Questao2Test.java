package com.capgemini.desafio.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao2;

public class Questao2Test {
	
	@Test
	public void senhaForte_deveriaValidarSenha () {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("Ya3&bi7");
		Assert.assertEquals(0, resposta);
	}
	
	@Test
	public void senha1caracter_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("v");
		Assert.assertEquals(5, resposta);
	}
	
	@Test
	public void senha2caracteres_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("v7");
		Assert.assertEquals(4, resposta);
	}
	
	@Test
	public void senha3caracteres_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("v7*");
		Assert.assertEquals(3, resposta);
	}
	
	@Test
	public void senha4caracteres_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("Y3&i");
		Assert.assertEquals(2, resposta);
	}
	
	@Test
	public void senha5caracteres_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("Y3&i#");
		Assert.assertEquals(1, resposta);
	}
	
	@Test
	public void senhaMaisDe6caracteres_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("Y3&i-f8");
		Assert.assertEquals(0, resposta);
	}
	
	@Test
	public void senhaSemMaiusculas_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("*bipl7");
		Assert.assertEquals(0, resposta);
	}
	
	@Test
	public void senhaSemMinusculas_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("P+IE0S");
		Assert.assertEquals(0, resposta);
	}
	
	@Test
	public void senhaSemDigito_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("%bieUn");
		Assert.assertEquals(0, resposta);
	}

	@Test
	public void senhaSemCaractereEspecial_deveriaValidarSenha() {
		Questao2 questao2 = new Questao2();
		int resposta = questao2.validarSenha("bTi7M3");
		Assert.assertEquals(0, resposta);
	}
}
