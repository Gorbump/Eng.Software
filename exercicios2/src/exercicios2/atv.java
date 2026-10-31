package exercicios2;
import java.util.Scanner;
public class atv {
	public static void main(String[] args) {
	     Scanner teclado = new Scanner(System.in);
	       double n;
	   
	  
	       System.out.println("Digite o valor de n");
	       n = teclado.nextInt();  
	       System.out.println(equacao(n));
	   }
	   public static double equacao(double n) {
	   	double s=0;
	   	int sinal = 1;
	      for(int i=1;i<=n;i++) {
	   	 s = s + sinal * (1.0/i);
	   	 sinal = -sinal;
	      }
	      return s;
	   }
	} 

