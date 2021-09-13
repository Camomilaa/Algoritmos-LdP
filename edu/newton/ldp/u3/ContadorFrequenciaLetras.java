package edu.newton.ldp.u3;

import javax.swing.JOptionPane;

/**
 * Nome: Camila Soares da Silva
 * 
 * Entrada: String com a frase inserida pelo usuário
 * Saída: Contagem de quantas vezes cada caractere foi encontrado na String
 */


public class ContadorFrequenciaLetras {

	public static void main(String[] args) {
		//declaração de variáveis
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, n = 0, m = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
		int maior = 0;
		String ma = "", saida = "";
		
		//entrada
		String entrada = JOptionPane.showInputDialog("Insira uma frase: ").toLowerCase();
		
		//processamento
		String[] caracteres = entrada.split("");
		for(int cont = 0; cont < caracteres.length; cont++) {
			
			if(caracteres[cont].equals("a")) {
				a++;
			} else if(caracteres[cont].equals("b")) {
				b++;
			} else if(caracteres[cont].equals("c")) {
				c++;
			} else if(caracteres[cont].equals("d")) {
				d++;
			} else if(caracteres[cont].equals("e")) {
				e++;
			} else if(caracteres[cont].equals("f")) {
				f++;
			} else if(caracteres[cont].equals("g")){
				g++;
			} else if(caracteres[cont].equals("h")){
				h++;
			} else if(caracteres[cont].equals("i")){
				i++;
			} else if(caracteres[cont].equals("j")){
				j++;
			} else if(caracteres[cont].equals("k")){
				k++;
			} else if(caracteres[cont].equals("l")){
				l++;
			} else if(caracteres[cont].equals("m")){
				m++;
			} else if(caracteres[cont].equals("n")){
				n++;
			} else if(caracteres[cont].equals("o")){
				o++;
			} else if(caracteres[cont].equals("p")){
				p++;
			} else if(caracteres[cont].equals("q")){
				q++;
			} else if(caracteres[cont].equals("r")){
				r++;
			} else if(caracteres[cont].equals("s")){
				s++;
			} else if(caracteres[cont].equals("t")){
				t++;
			} else if(caracteres[cont].equals("u")){
				u++;
			} else if(caracteres[cont].equals("v")){
				v++;
			} else if(caracteres[cont].equals("w")){
				w++;
			} else if(caracteres[cont].equals("x")){
				x++;
			} else if(caracteres[cont].equals("y")){
				y++;
			} else if(caracteres[cont].equals("z")){
				z++;
			}
		}
		
		//Indicando o maior número de letras e construindo a saída
		if(a>0) {
			saida = saida + "Foram encontradas " + a + " letras A\n";
			if (a > maior) {
				maior = a;
				ma = "A";
			}
		}
		if(b>0) {
			saida = saida + "Foram encontradas " + b + " letras B\n";
			if (b > maior) {
				maior = b;
				ma = "B";
			}
		}
		if(c>0) {
			saida = saida + "Foram encontradas " + c + " letras C\n";
			if (c > maior) {
				maior = c;
				ma = "C";
			}
		}
		if(d>0) {
			saida = saida + "Foram encontradas " + d + " letras D\n";
			if (d > maior) {
				maior = d;
				ma = "D";
			}
		}
		if(e>0) {
			saida = saida + "Foram encontradas " + e + " letras E\n";
			if (e > maior) {
				maior = e;
				ma = "E";
			}
		}
		if(f>0) {
			saida = saida + "Foram encontradas " + f + " letras F\n";
			if (f > maior) {
				maior = f;
				ma = "F";
			}
		}
		if(g>0) {
			saida = saida + "Foram encontradas " + g + " letras G\n";
			if (g > maior) {
				maior = g;
				ma = "G";
			}
		}
		if(h>0) {
			saida = saida + "Foram encontradas " + h + " letras H\n";
			if (h > maior) {
				maior = h;
				ma = "H";
			}
		}
		if(i>0) {
			saida = saida + "Foram encontradas " + i + " letras I\n";
			if (i > maior) {
				maior = i;
				ma = "i";
			}
		}
		if(j>0) {
			saida = saida + "Foram encontradas " + j + " letras J\n";
			if (j > maior) {
				maior = j;
				ma = "J";
			}
		}
		if(k>0) {
			saida = saida + "Foram encontradas " + k + " letras K\n";
			if (k > maior) {
				maior = k;
				ma = "K";
			}
		}
		if(l>0) {
			saida = saida + "Foram encontradas " + l + " letras L\n";
			if (l > maior) {
				maior = l;
				ma = "L";
			}
		}
		if(m>0) {
			saida = saida + "Foram encontradas " + m + " letras M\n";
			if (m > maior) {
				maior = m;
				ma = "M";
			}
		}
		if(n>0) {
			saida = saida + "Foram encontradas " + n + " letras N\n";
			if (n > maior) {
				maior = n;
				ma = "N";
			}
		}
		if(o>0) {
			saida = saida + "Foram encontradas " + o + " letras O\n";
			if (o > maior) {
				maior = o;
				ma = "O";
			}
		}
		if(p>0) {
			saida = saida + "Foram encontradas " + p + " letras P\n";
			if (p > maior) {
				maior = p;
				ma = "P";
			}
		}
		if(q>0) {
			saida = saida + "Foram encontradas " + q + " letras Q\n";
			if (q > maior) {
				maior = q;
				ma = "Q";
			}
		}
		if(r>0) {
			saida = saida + "Foram encontradas " + r + " letras R\n";
			if (r > maior) {
				maior = r;
				ma = "R";
			}
		}
		if(s>0) {
			saida = saida + "Foram encontradas " + s + " letras S\n";
			if (s > maior) {
				maior = s;
				ma = "S";
			}
		}
		if(t>0) {
			saida = saida + "Foram encontradas " + t + " letras T\n";
			if (t > maior) {
				maior = t;
				ma = "T";
			}
		}
		if(u>0) {
			saida = saida + "Foram encontradas " + u + " letras U\n";
			if (u > maior) {
				maior = u;
				ma = "U";
			}
		}
		if(v>0) {
			saida = saida + "Foram encontradas " + v + " letras V\n";
			if (v > maior) {
				maior = v;
				ma = "V";
			}
		}
		if(w>0) {
			saida = saida + "Foram encontradas " + w + " letras W\n";
			if (w > maior) {
				maior = w;
				ma = "W";
			}
		}
		if(x>0) {
			saida = saida + "Foram encontradas " + x + " letras X\n";
			if (x > maior) {
				maior = x;
				ma = "X";
			}
		}
		if(y>0) {
			saida = saida + "Foram encontradas " + y + " letras Y\n";
			if (y > maior) {
				maior = y;
				ma = "Y";
			}
		}
		if(z>0){
			saida = saida + "Foram encontradas " + z + " letras Z\n";
			if (z > maior) {
				maior = z;
				ma = "Z";
			}
		}
		
		//Saída
		JOptionPane.showMessageDialog(null, "A letra mais repetida foi " + ma + " (" + maior + " vezes)\n" + saida);
		
	}

}
