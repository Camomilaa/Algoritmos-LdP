package edu.newton.ldp.u6.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		try {
			// 1. abrir um fluxo de entrada para o arquivo
			fis = new FileInputStream("C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\bytes\\leitura.txt");

			// 2. realizar a leitura dos bytes (um de cada vez)
			int c;
			// enquanto não for fim de arquivo . . .
			int numBytes = 0;
			while ((c = fis.read()) != -1) { // byte a byte
				// 3. exibir na saída padrão o byte lido
				System.out.println(c + " = " + (char)c);
				numBytes++;
			}

			System.out.println("Bytes lidos: " + numBytes);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (fis != null) {
				// 4. encerrar o fluxo
				fis.close();
			}
		}

	}

}
