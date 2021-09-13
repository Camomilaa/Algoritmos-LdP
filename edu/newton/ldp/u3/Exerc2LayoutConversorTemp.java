package edu.newton.ldp.u3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exerc2LayoutConversorTemp {

	public static void main(String[] args) {
		//janela
		JFrame frame = new JFrame("CoversorTemp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Atributos da janela
		frame.setSize(600, 400);
		
		//componentes da janela
		
		//componentes com propriedades
		var painel = frame.getContentPane();
		var painelNorte = new JPanel(new FlowLayout());
		var label = new JLabel("Digite a temperatura: ");
		painelNorte.add(label);
		
		var entrada = new JTextField(5);
		painelNorte.add(entrada);
		painel.add(painelNorte, BorderLayout.NORTH);
		
		var painelCentro = new JPanel(new GridLayout(2,1));
		var celsius = new JRadioButton("Celsius");
		painelCentro.add(celsius);
		var fahrenheit = new JRadioButton("Fahrenheit");
		painelCentro.add(fahrenheit);
		painel.add(painelCentro, BorderLayout.CENTER);
		
		//Resultado
		var labelResultado = new JLabel("Resultado: ");
		var resposta = new JTextField("90");
		resposta.setEditable(false);
		
		var painelSul = new JPanel(new FlowLayout());
		painelSul.add(labelResultado);
		painelSul.add(resposta);
		painel.add(painelSul, BorderLayout.SOUTH);
		
		
		//requisição para exibição da tela e seus atributos
		frame.pack();
		frame.setVisible(true);
		

	}

}
