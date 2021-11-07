package edu.newton.ldp.u6.Lab6.Problema2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problema2 {
	
	public static void main(String[] args) throws ArquivoException, IOException{
		Scanner sc = new Scanner(System.in);
		boolean iguais = true;
		
		System.out.println("Insira o nome do primeiro arquivo:");
		var primeiroArq = sc.nextLine();
		
		System.out.println("Insira o nome do segundo arquivo: ");
		var segundoArq = sc.nextLine();
		
		var caminhoArq1 = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\Lab6\\Problema2\\" + primeiroArq;
		var caminhoArq2 = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\Lab6\\Problema2\\" + segundoArq;
		
		try {
			int c, k;
			var arquivo1 = new File(caminhoArq1);
			var arquivo2 = new File(caminhoArq2);
				
			if(!arquivo1.isFile() || !arquivo2.isFile()) {
				throw new ArquivoException();
			}
				
			FileInputStream fis1 = new FileInputStream(arquivo1);
			FileInputStream fis2 = new FileInputStream(arquivo2);
			
				
			while((c = fis1.read()) != -1 && (k = fis2.read()) != -1) {
				if (c != k) {
					iguais = false;
				}
			}
			
			if(arquivo1.length() != arquivo2.length()) {
				iguais = false;
			}
			
		} catch(ArquivoException | IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if(iguais == false) {
				System.out.println("Os dois arquivos são diferentes");
			} else {
				System.out.println("Os dois arquivos são iguais");
			}
		}
		

	}

}
