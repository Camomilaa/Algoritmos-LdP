package edu.newton.ldp.av1;

import java.util.ArrayList;


public class Problema3 {

	public static void main(String[] args) {
		var cadastro = new ArrayList<Produto>();
		
		var p1 = new Produto("Chiclete", "Bubbaloo", "2007-12-03", 0.55f);
		var p2 = new Produto("Bala", "IceKiss", "2007-12-03",  0.20f);
		var p3 = new Produto("Pirulito", "POP", "2007-12-03",  1.20f);
		
		cadastro.add(p1);
		cadastro.add(p2);
		cadastro.add(p3);
		
		Float soma = 0f;
		for(var item : cadastro) {
			soma += item.valor;
		}
		System.out.println("O valor total da soma dos produtos equivale a " + soma);
		
		Float media = soma/cadastro.size();
		System.out.println("O valor medio dos produtos equivale a " + media);
		
		Float maior= 0f , nValor = 0f;
		String nMarca= "a", nNome = "a";
		for(int i = 0; i < cadastro.size(); i++) {
			if (i == 0) {
				maior = cadastro.get(i).valor;
				nMarca = cadastro.get(i).marca;
				nNome = cadastro.get(i).nome;
				nValor = cadastro.get(i).valor;
			} else {
				if(cadastro.get(i).valor > maior) {
					nMarca = cadastro.get(i).marca;
					nNome = cadastro.get(i).nome;
					nValor = cadastro.get(i).valor;
				}
			}
		}
		System.out.println("O produto mais caro é o/a " + nNome + " da marca " + nMarca + " do valor " + nValor);
		
		Float bValor = 0f;
		String bMarca= "a", bNome = "a";
		
		for(int i = 0; i < cadastro.size(); i++) {
			if (i == 0) {
				bMarca = cadastro.get(i).marca;
				bNome = cadastro.get(i).nome;
				bValor = cadastro.get(i).valor;
			} else {
				if(cadastro.get(i).valor < maior) {
					bMarca = cadastro.get(i).marca;
					bNome = cadastro.get(i).nome;
					bValor = cadastro.get(i).valor;
				}
			}
		}
		System.out.println("O produto mais barato é o/a " + bNome + " da marca " + bMarca + " do valor " + bValor);
	}

}
