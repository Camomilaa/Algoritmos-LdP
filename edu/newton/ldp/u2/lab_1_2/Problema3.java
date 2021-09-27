package edu.newton.ldp.u2.lab_1_2;

import javax.swing.JOptionPane;

/**
 * 
 * Problema 3:
 * 
 * Entrada: Valor do salário inserido pelo usuário.
 * Saída: A porcentagem e o valor da aliquota.
 * 
 * @author Camila Soares da Silva
 *
 */

public class Problema3 {
	
	public static void aliquota(double taxa, double sal, int ano) {
		double al = taxa * sal;
		System.out.println("A porcentagem da alíquota em " + ano + " é " + taxa*100 + "%, ");
		System.out.printf("portanto o valor da alíquota é R$%.2f\n", al);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		//declaração de variáveis
		double sal;
		String s;
		
		//entrada
		s = JOptionPane.showInputDialog("Insira o valor do seu salário:");
		sal = Double.valueOf(s);
		
		//processamento e saída IRPF 2021
		if(sal <= 1903.98) {
			aliquota(0, sal, 2021);
		}
		else if(sal <= 2826.65) {
			aliquota(0.075, sal, 2021);
		}
		else if (sal <= 3751.05) {
			aliquota(0.15, sal, 2021);
		}
		else if(sal <= 4664.68) {
			aliquota(0.225, sal, 2021);
		}
		else {
			aliquota(0.275, sal, 2021);
		}
		
		//processamento e saída IRPF 2022
		if(sal <= 2500) {
			aliquota(0, sal, 2022);
		}
		else if(sal <= 3200) {
			aliquota(0.075, sal, 2022);
		}
		else if (sal <= 4250) {
			aliquota(0.15, sal, 2022);
		}
		else if(sal <= 5300) {
			aliquota(0.225, sal, 2022);
		}
		else {
			aliquota(0.275, sal, 2022);
		}
		
	}

}
