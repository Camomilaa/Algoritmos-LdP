package edu.newton.ldp.u6.chars;

import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraChar {

	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\chars\\ler.txt");
			
			int c;
			int numChars = 0;
			while((c = fr.read()) != -1) {
				System.out.println(c + " = " + (char)c);
				numChars++;
			}
			System.out.println("Characters lidos: " + numChars);
		} catch(Exception e) {
			throw e;
		} finally {
			if(fr != null) {
				fr.close();
			}
		}

	}

}
