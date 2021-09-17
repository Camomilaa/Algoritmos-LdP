package edu.newton.ldp.u4;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex1Vetores {
	public static void main(String[] args) {
		int par = 0, impar = 0;
		//definindo o vetor principal
		String q = JOptionPane.showInputDialog("Insira a quantidade de n�meros: ");
		int quant = Integer.parseInt(q);
		int[] numeros = new int[quant];
		for(int i = 0; i < numeros.length; i++) {
			 String n = JOptionPane.showInputDialog("Insira o n�mero: ");
			 numeros[i] = Integer.parseInt(n);
			 if(numeros[i] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
		}
		
		int[]pares = new int[par];
		int[]impares = new int[impar];
		
		for(int c = 0; c < numeros.length; c++) {
			int p = 0, im = 0;
			if(numeros[c] % 2 == 0) {
				 pares[p] = numeros[c];
				p++;
			} else {
				impares[im] = numeros[c];
				im++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Os n�meros adicionados foram " + Arrays.toString(numeros) + "\nOs n�meros pares foram " + Arrays.toString(pares) + "\nOs n�meros impares foram " + Arrays.toString(impares));
		
		
	}
}
