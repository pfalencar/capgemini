package com.capgemini.desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Questao3 {
	
	public int calcularQtdParesAnagramas(String s) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] c = s.substring(i, j+1).toCharArray();
				Arrays.sort(c);
				String k = new String(c);
				if (hashMap.containsKey(k)) {
					hashMap.put(k, hashMap.get(k) + 1);
				} else {
					hashMap.put(k, 1);
				}
			}
		}
		int anagramPairs = 0;
		for (String k: hashMap.keySet()) {
			int v = hashMap.get(k);
			anagramPairs += (v * (v - 1)) / 2; 
		}
		return anagramPairs;
	}

}
