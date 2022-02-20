package com.capgemini.desafio;

public class Questao2 {

	public int validarSenha(String senha) {
		int tamanho = senha.length();
		int quantidadeCaracteresFaltantes = 0;
		char ch;
		String specialCharactersString = "!@#$%^&*()-+";
		boolean temMaiuscula = false;
		boolean temMinuscula = false;
		boolean temDigito = false;
		boolean temCaractereEspecial = false;
		if (tamanho >= 6) {
			for (int i = 0; i < senha.length(); i++) {
				ch = senha.charAt(i);
				System.out.print("Caractere: " + ch + " - ");
				if (Character.isDigit(ch)) {
					temDigito = true;
					System.out.println("Tem dígito");
					continue;
				} else if (Character.isUpperCase(ch)) {
					System.out.println("É maiúscula");
					temMaiuscula = true;
					continue;
				} else if (Character.isLowerCase(ch)) {
					System.out.println("É minúscula");
					temMinuscula = true;
					continue;
				} else if (specialCharactersString.contains(Character.toString(ch))) {
					System.out.println("Contém caractere especial");
					temCaractereEspecial = true;
					continue;
				}
			}
			if (temDigito) {
				if (temMaiuscula) {
					if (temMinuscula) {
						if (temCaractereEspecial) {
							System.out.println("Senha forte!");
						} else {
							System.out.println("A senha precisa conter no mínimo 1 caractere especial");
						}
					} else {
						System.out.println("A senha precisa conter no mínimo 1 letra em minúsculo");
					}
				} else {
					System.out.println("A senha precisa conter no mínimo 1 letra em maiúscula");
				}
			} else {
				System.out.println("A senha precisa conter no mínimo 1 dígito");
			}
			return quantidadeCaracteresFaltantes;
		} else {
			System.out.println("Senha < 6 caracteres");
			quantidadeCaracteresFaltantes = 6 - tamanho;
			return quantidadeCaracteresFaltantes;
		}
	}

}
