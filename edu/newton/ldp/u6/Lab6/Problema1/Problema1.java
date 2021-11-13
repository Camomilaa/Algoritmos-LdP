package edu.newton.ldp.u6.Lab6.Problema1;

/**
 * OBS: Esse código foi criado com base na forma que os diretórios e arquivos foram organizados dentro do meu computador
 * e talvez precise ser adaptado para rodar fora dele.
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) throws ArquivoNaoEncontradoException, IOException{
		Scanner sc = new Scanner(System.in);
		//Caminho que leva a pasta principal e vai ser usada como base para contruir novos caminhos
		var caminhoBasico = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\Lab6\\Problema1";
		
		//Declaração de variáveis
		boolean arquivoAchado = false, diretorioAchado = false, erro = false;
		int c;
		
		//diretorio inicial - Pasta onde se encontra o arquivo a ser movido
		var caminhoInicial = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\Lab6\\Problema1\\D1";
		
		//diretorio final - Pasta onde o arquivo vai ser movido
		System.out.println("Insira o nome do diretório que deseja colar o arquivo:");
		var nomeDirFinal = sc.nextLine();
		
		//nome do arquivo
		System.out.println("Insira o nome do arquivo que deseja mover:");
		var arquivo = sc.nextLine();
		
		//leitura e escrita de arquivos
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//processamento
		try {
			var diretorioInicial = new File(caminhoInicial);
			
			var componentes = diretorioInicial.list();
			
			//procurando arquivo
			for(var componente : componentes) {
				if(componente.equals(arquivo)) {
					arquivoAchado = true;
				}
			}
			
			if(arquivoAchado == false) {
				throw new ArquivoNaoEncontradoException();
			}
			
			//buscando diretório destinatário
			var diretorioBasico = new File(caminhoBasico);
			var componentesPrincipais = diretorioBasico.list();
			
			for(var item : componentesPrincipais) {
				if(item.equals(nomeDirFinal)) {
					diretorioAchado = true;
				}
			}
			
			var caminhoFinal = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\Lab6\\Problema1\\"
					+ nomeDirFinal;
			var diretorioFinal = new File(caminhoFinal);
			
			//caso não ache o diretorio
			if(diretorioAchado == false) {
				System.out.println("O diretório de destino não foi encontrado, deseja criá-lo? (Responda S para sim / N para não)");
				var resposta = sc.nextLine();
				if(resposta.toLowerCase().equals("s")) {
					diretorioFinal.mkdirs();
				} else {
					System.out.println("Não foi possivel mover o arquivo! Tente adicionar outro diretório destino.");
					System.exit(0);
				}
			}
			
			//criando copia do arquivo
			var arquivoCopia = new File(caminhoFinal + "\\" + arquivo);
			arquivoCopia.createNewFile();
			
			//copiando arquivo
			var caminhoArquivo = caminhoInicial + "\\" + arquivo;
			fis = new FileInputStream(caminhoArquivo);
			fos = new FileOutputStream(caminhoFinal + "\\" + arquivo);
			
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
			fos.flush();
			fis.close();
			fos.close();
			
			//deletando arquivo original
			var arquivoBase = new File(caminhoArquivo);
			System.out.println(caminhoArquivo);
			arquivoBase.delete();
				
		} catch (ArquivoNaoEncontradoException ex) {
			System.out.println(ex.getMessage());
			erro = true;
		} finally {
			sc.close();
			if (erro == false) {
				System.out.println("Você moveu o arquivo com sucesso!");
			}
		}
		
	}

}
