package Atv;
import java.util.Scanner;
public class Ts1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, resul;
		int a, b, sequencia [] = new int[5], c, d, notas [] = new int[5];	
		double z;
		
		System.out.println("Digite seu nome");
		nome = teclado.nextLine();
		
		exibirSaudacao(nome);
		
		System.out.println("Digite um número inteiro");
		a = teclado.nextInt();
		
		b = calcularDobro(a);
		System.out.println("O dobro foi: " + b);
		
		for (int x=0;x<sequencia.length;x++) {
		System.out.println("Digite o número " + (x+1));
		sequencia[x] = teclado.nextInt();
		}
		
		c = somarArray(sequencia);
		System.out.println("A soma foi: " + c);
		
		d = encontrarMaior(sequencia);
		System.out.println("O maior foi: " + d);
		
		for(int m=0;m<notas.length;m++) {
		System.out.println("Digite a " + (m+1) + " nota do aluno");
		notas [m] = teclado.nextInt();
		}
		
		z = calcularMedia(notas);
		System.out.println("A média foi: " + z);
		
		resul = classificarMedia(z);
		System.out.println(resul);
		
	}
	//1 com void para não devolver nada
	static void  exibirSaudacao (String nom) {
		System.out.println("Olá, " + nom + "! Seja bem-vindo.");
	}
	//2 retorna o dobro no a depois transformo em b
	static int calcularDobro (int num) {
		int b;
		b = num * 2;
		
		return b;
	}
	//3 Somar todos os arrays e retorna
	static int somarArray (int [] seq) {
		int c=0;
		for (int x=0;x<seq.length;x++) {
		c = seq[x] + c;
		}
		return c;
	}
	//4  Encontrar maior inicia em maior[0] para evitar problemas com números negativos
	static int encontrarMaior(int [] maior) {
		int d = maior[0];
		for (int x=1;x<maior.length;x++) {
			if(maior[x] > d) {
				d = maior[x];
			}
		}
		return d;
	}
	//5 Calculo simples de media
	static double calcularMedia (int [] med) {
		double z=0;
		for(int x=0;x<med.length;x++) {
			z = med[x] + z;
		}
		z =  (double) z/med.length;
		return z;
	}
	//6 aprovado ou não com retorno do string
	static String classificarMedia (double apv) {
	String resul;
	 if(apv >= 6) {
		 resul = "Aprovado";
	 } else {
		 resul = "Desaprovado";
	 }
	 return resul;
	}
}
