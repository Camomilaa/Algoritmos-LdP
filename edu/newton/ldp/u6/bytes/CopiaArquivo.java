package edu.newton.ldp.u6.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaArquivo {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			int c;
			fis = new FileInputStream("C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\bytes\\entrada.txt");
			fos = new FileOutputStream("C:\\Users\\Gadrit\\Documents\\Newton Paiva\\3 Semestre\\Linguagens de Programação\\eclipse\\2021_LP\\src\\edu\\newton\\ldp\\u6\\bytes\\saida.txt");
			while((c = fis.read()) != -1){
				char letra = (char)c;
				fos.write(letra);
			}
			fos.flush();
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (fis != null && fos != null) {
				fos.close();
				fis.close();
			}
		}

	}

}
