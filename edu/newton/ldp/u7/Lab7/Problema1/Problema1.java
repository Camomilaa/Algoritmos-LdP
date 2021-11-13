package edu.newton.ldp.u7.Lab7.Problema1;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Problema1 {
	public static void listar(String caminho) {
		var lista = new File(caminho).list();
		
		for(var item: lista) {
			if(new File(caminho + "\\" + item).isDirectory()) {
				System.out.println(item + ": diretorio");
				listar(caminho + "\\" + item);
			} else {
				System.out.println(item + ": arquivo");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Diretório base
		System.out.println("Insira o caminho do diretório que deseja analisar:");
		var baseDir = sc.nextLine();
		
		listar(baseDir);
	}
}
