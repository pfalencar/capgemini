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
					System.out.println("Tem d�gito");
					continue;
				} else if (Character.isUpperCase(ch)) {
					System.out.println("� mai�scula");
					temMaiuscula = true;
					continue;
				} else if (Character.isLowerCase(ch)) {
					System.out.println("� min�scula");
					temMinuscula = true;
					continue;
				} else if (specialCharactersString.contains(Character.toString(ch))) {
					System.out.println("Cont�m caractere especial");
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
							System.out.println("A senha precisa conter no m�nimo 1 caractere especial");
						}
					} else {
						System.out.println("A senha precisa conter no m�nimo 1 letra em min�sculo");
					}
				} else {
					System.out.println("A senha precisa conter no m�nimo 1 letra em mai�scula");
				}
			} else {
				System.out.println("A senha precisa conter no m�nimo 1 d�gito");
			}
			return quantidadeCaracteresFaltantes;
		} else {
			System.out.println("Senha < 6 caracteres");
			quantidadeCaracteresFaltantes = 6 - tamanho;
			return quantidadeCaracteresFaltantes;
		}
	}

}
