package edu.newton.ldp.u3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Entrada: Peso e altura digitadas pelo usuário
 * Saída: Indice de Massa Corporal
 * @author Camila Soares da Silva
 *
 */

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		//Janela
		JFrame frame = new JFrame("Calculadora de Indice de Massa Corporal");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//atributos da janela
		var painel = frame.getContentPane();
		painel.setSize(300, 300);
		
		//Componentes da janela
		//Entrada
		var painelNorte = new JPanel(new FlowLayout());
		var labelAltura = new JLabel("Insira sua altura: ");
		painelNorte.add(labelAltura);
		var entrada1 = new JTextField(5);
		painelNorte.add(entrada1);
		painel.add(painelNorte, BorderLayout.NORTH);
		
		var painelCentro = new JPanel(new FlowLayout());
		var labelPeso = new JLabel("Insira seu peso:  ");
		painelCentro.add(labelPeso);
		var entrada2 = new JTextField(5);
		painelCentro.add(entrada2);
		painel.add(painelCentro, BorderLayout.CENTER);
		
		//Botão
		var painelSul = new JPanel(new FlowLayout());
		var botao = new JButton("Calcular");
		painelSul.add(botao);
		painel.add(painelSul, BorderLayout.SOUTH);
		
		
		//Exibindo componentes
		frame.pack();
		frame.setVisible(true);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			double peso = Double.valueOf(entrada2.getText().replace(",", "."));
			double altura = Double.valueOf(entrada1.getText().replace(",", "."));
			double imc = peso / (Math.pow(altura, 2));
			JOptionPane.showMessageDialog(frame, "Seu IMC equivale a " + imc);
			System.out.printf("Seu IMC equivale a %.2f\n", imc);
			}
		});
		
	}

}
