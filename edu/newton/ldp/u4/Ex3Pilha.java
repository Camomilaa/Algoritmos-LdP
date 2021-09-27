package edu.newton.ldp.u4;

import java.util.Stack;

public class Ex3Pilha {

	public static void main(String[] args) {
		var pilha = new Stack<Character>();
		var pilhaC = new Stack<Character>();
		
		pilha.add('a');
		pilha.add('e');
		pilha.add('i');
		pilha.add('o');
		
		System.out.println(pilha);
		System.out.println("Topo da pilha inicial " + pilha.peek());
		
		while(!pilha.empty()) {
			pilhaC.add(pilha.pop());
		}
		
		System.out.println(pilhaC);
		System.out.println("Topo da pilha secundária " + pilhaC.peek());
	}

}
