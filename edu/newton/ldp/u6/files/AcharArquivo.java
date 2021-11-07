package edu.newton.ldp.u6.files;

import java.util.Scanner;
import java.io.File;

public class AcharArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o caminho do diretório:");
		var caminho = sc.nextLine();
		
		System.out.println("digite o nome do arquivo:");
		var nomeArquivo = sc.nextLine();
		
		var diretorio = new File(caminho);
		
		if (!diretorio.exists()) {
			System.out.println("O caminho não existe: " + caminho);

			System.exit(0);
		}
		
		if (diretorio.isDirectory()) {
			var diretorios = diretorio.list();
			int naoArq = 0;
			for (var item: diretorios) {
				if (item.equals(nomeArquivo)) {
					System.out.println("O arquivo existe!");
				} else {
					naoArq++;
					if(naoArq == diretorios.length) {
						System.out.println("Arquivo não encontrado.");
					}
				}
			}
		} else if(!diretorio.isDirectory()) {
			System.out.println("Não é um diretorio.");
		}
		
		sc.close();
	}

}
