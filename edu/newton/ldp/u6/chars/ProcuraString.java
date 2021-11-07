package edu.newton.ldp.u6.chars;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProcuraString {

	// Problema (grep):
	// Entrada: nome de um arquivo texto e uma palavra lidos do usuário
		// JOptionPane ou Scanner(System.in)
	// Saída: informar se a palavra existe no arquivo ou não
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		var arq = "C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\chars\\Olha.txt";
		System.out.println("Digite a palavra: ");
		var palavra = sc.next();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(arq));
			
			String linha = null;
			while ((linha = br.readLine()) != null) {
				if (linha.toLowerCase().contains(palavra)) {
					System.out.println("INFO: palavra encontrada no arquivo!");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				br.close();
			}
		}
		sc.close();
	}
}