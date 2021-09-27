package edu.newton.ldp.u4.lab_3_4;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author Camila Soares da Silva
 * RA: 12109716
 * 
 * Tela:
 * Cadastro e listagem (N)
 * Número registro:    1
 * Nome completo:      [             ]
 * CPF:                [             ]
 * Email:              [             ]
 * Telefone:           [             ]
 * Data de Nascimento: [             ]
 * 
 * <Voltar> <Avançar>      <Salvar> <Excluir>
 * 
 *
 */
public class Problema1 {
		
		public static void main(String[] args) {
			//variaveis
			var cadastro = new ArrayList<PessoaFisica>();
			//Janela
			JFrame frame = new JFrame("Cadastro");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 300);
			var painel = frame.getContentPane();

			
			//Informações
			JPanel infos = new JPanel();
			infos.setLayout(new GridBagLayout());
			infos.setSize(200,200);
			var cons = new GridBagConstraints();
			
			JLabel cont = new JLabel("Cadastro e listagem (" + 0 + ")\n");
			JLabel s = new JLabel(" ");
			JLabel nome = new JLabel("Nome Completo: ");
			JLabel cpf = new JLabel("CPF: ");
			JLabel email = new JLabel("Email: ");
			JLabel telefone = new JLabel("Telefone: ");
			JLabel data = new JLabel("Data Nascimento: ");
			JLabel registro = new JLabel("Número de registro:     ");
			JLabel nun = new JLabel("1");
			JTextField campoNome = new JTextField(15);
			JTextField campoCpf = new JTextField(15);
			JTextField campoEmail = new JTextField(15);
			JTextField campoTel = new JTextField(15);
			JTextField campoData = new JTextField(15);

			cons.gridx=0;
	        cons.gridy=0;
	        infos.add(cont, cons);
	        cons.gridx=0;
	        cons.gridy=1;
	        infos.add(s,cons);
	        cons.gridx=0;
	        cons.gridy=2;
	        infos.add(registro,cons);
	        cons.gridx=1;
	        cons.gridy=2;
	        infos.add(nun, cons);
			cons.gridx=0;
	        cons.gridy=3;
	        infos.add(nome, cons);
	        cons.gridx=1;
	        cons.gridy=3;
	        infos.add(campoNome, cons);
	        cons.gridx=0;
	        cons.gridy=4;
	        infos.add(cpf, cons);
	        cons.gridx=1;
	        cons.gridy=4;
	        infos.add(campoCpf, cons);
	        cons.gridx=0;
	        cons.gridy=5;
	        infos.add(email, cons);
	        cons.gridx=1;
	        cons.gridy=5;
	        infos.add(campoEmail, cons);
	        cons.gridx=0;
	        cons.gridy=6;
	        infos.add(telefone, cons);
	        cons.gridx=1;
	        cons.gridy=6;
	        infos.add(campoTel, cons);
	        cons.gridx=0;
	        cons.gridy=7;
	        infos.add(data, cons);
	        cons.gridx=1;
	        cons.gridy=7;
	        infos.add(campoData, cons);
	        
	        painel.add(infos);
	        
	        //Botões
	        JPanel botoes = new JPanel();
	        botoes.setLayout(new FlowLayout());
	        var voltar = new JButton("Voltar");
	        botoes.add(voltar);
	        var avancar = new JButton("Avançar");
	        botoes.add(avancar);
	        var es = new JLabel("             ");
	        botoes.add(es);
	        var salvar = new JButton("Salvar");
	        botoes.add(salvar);
	        var excluir = new JButton("Excluir");
	        botoes.add(excluir);
	        painel.add(botoes, BorderLayout.SOUTH);
	        
			//tornar janela visivel
	        frame.setVisible(true);
	        
	        //Salvar
	        salvar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					var nome = campoNome.getText();
					var cpf = campoCpf.getText();
					var email = campoEmail.getText();
					var telefone = campoTel.getText();
					var data = campoData.getText();
					var cod = 0;
					if(cadastro.isEmpty()) {
						cod = 0;
					} else {
						cod = cadastro.size();	
					}
					var pessoa = new PessoaFisica(nome, cpf, email, telefone, data, cod);
					cadastro.add(pessoa);
					campoNome.setText("");
					campoCpf.setText("");
					campoEmail.setText("");
					campoTel.setText("");
					campoData.setText("");
					cont.setText("Cadastro e listagem (" + cadastro.size() + ")");
					nun.setText(Integer.toString(cadastro.size() + 1));
					
				}
			});
	        
	        //Voltar
	        voltar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int c = Integer.parseInt(nun.getText());
					int m = cadastro.size();
					try {
						campoNome.setText(cadastro.get(c-2).nome);
						campoCpf.setText(cadastro.get(c-2).cpf);
						campoEmail.setText(cadastro.get(c-2).email);
						campoTel.setText(cadastro.get(c-2).telefone);
						campoData.setText(cadastro.get(c-2).data);
						nun.setText(Integer.toString(c-1));
					} catch(IndexOutOfBoundsException a){
						campoNome.setText("");
						campoCpf.setText("");
						campoEmail.setText("");
						campoTel.setText("");
						campoData.setText("");
						nun.setText(Integer.toString(m + 1));
					}
					
				}
			});
	        
	        //Avançar
	        avancar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int c = Integer.parseInt(nun.getText());
					try {
						campoNome.setText(cadastro.get(c).nome);
						campoCpf.setText(cadastro.get(c).cpf);
						campoEmail.setText(cadastro.get(c).email);
						campoTel.setText(cadastro.get(c).telefone);
						campoData.setText(cadastro.get(c).data);
						nun.setText(Integer.toString(c+1));
					} catch(IndexOutOfBoundsException a) {
						campoNome.setText("");
						campoCpf.setText("");
						campoEmail.setText("");
						campoTel.setText("");
						campoData.setText("");
						nun.setText(Integer.toString(c+1));
					}
					
				}
			});
	        
	        //Excluir
	        excluir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int c = Integer.parseInt(nun.getText());
					cadastro.remove(c-1);
					campoNome.setText(cadastro.get(c-1).nome);
					campoCpf.setText(cadastro.get(c-1).cpf);
					campoEmail.setText(cadastro.get(c-1).email);
					campoTel.setText(cadastro.get(c-1).telefone);
					campoData.setText(cadastro.get(c-1).data);
				}
			});
			
		}

	}
