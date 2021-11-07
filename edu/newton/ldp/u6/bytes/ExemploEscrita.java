package edu.newton.ldp.u6.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploEscrita {

	public static void main(String[] args) throws IOException{
		var frase = "O rato roeu a roupa do rei de Romar";
		FileOutputStream fos = null;
		
		try {
			// abrir fluxo de escrita
			fos = new FileOutputStream("C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\bytes\\escrita.txt");
			int numBytes = 0;
			
			//escrita byte a byte no arquivo
			for(char c : frase.toCharArray()) {
				fos.write(c);
				numBytes++;
			}
			
			fos.flush();
			System.out.println("Número de bytes escritos: " + numBytes);
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if(fos != null) {
				fos.close();
			}
		}

	}

}
