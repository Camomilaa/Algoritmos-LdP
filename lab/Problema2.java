package lab;

import javax.swing.JOptionPane;

/**
 * 
 * Problema 2:
 * 
 * Entrada: Peso e altura informados pelo usuário.
 * Saída: Indice de Massa Corporal, Grau de Obesidade e Classificação.
 * 
 * @author Camila Soares da Silva
 *
 */

public class Problema2 {
	
	public static void printInfo(double imc, String classificacao, String grau) {
		System.out.printf("Seu IMC é %.2f\n", imc);
		System.out.println("Sua classificação: " + classificacao);
		System.out.println("Obesidade grau " + grau);
	}

	public static void main(String[] args) {
		
		//declaração de variáveis
		double peso, altura, imc;
		String p, a;
		
		//entrada
		p = JOptionPane.showInputDialog("Insira seu peso");
		a = JOptionPane.showInputDialog("Insira sua altura:");

		//processamento
		peso = Double.valueOf(p);
		altura = Double.valueOf(a);
		
		imc = peso / (Math.pow(altura, 2));
		
		//saída
		if(imc < 18.5) {
			printInfo(imc, "magreza", "0");
		}
		else if(imc < 24.9) {
			printInfo(imc, "normal", "0");
		}
		else if(imc < 29.9) {
			printInfo(imc, "sobrepeso", "I");
		}
		else if(imc < 39.9) {
			printInfo(imc, "obesidade", "II");
		}
		else {
			printInfo(imc, "obesidade grave", "III");
		}
		
	}

}
