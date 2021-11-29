package edu.newton.ldp.u7;

public class Sequencia2 {
	
	public static String sequencia(int num) {
		if(num == 2) {
			return "";
		}
		
		if(num % 2 != 0) {
			num = num + 1;
		} 
		var novoNum = num - 2;
		String sNovoNum = String.valueOf(novoNum);
		
		return sequencia(novoNum) + sNovoNum + " ";
	}
	
	public static void main(String[] args) {
		var num = 11;
		var r = sequencia(num);
		System.out.println(r + num);

	}

}
