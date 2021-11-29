package edu.newton.ldp.u7;

public class Binario {
	
	public static String binario(int num) {
		if (num == 1) {
			return String.valueOf(1);
		}
		
		var bin = num % 2;
		int novoNum = num / 2;
		
		return binario(novoNum) + String.valueOf(bin);
	}
	
	public static void main(String[] args) {
		var r = binario(10);
		System.out.println(r);

	}

}
