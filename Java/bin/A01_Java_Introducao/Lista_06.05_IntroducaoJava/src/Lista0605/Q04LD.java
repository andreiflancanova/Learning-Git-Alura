package Lista0605;

import java.util.Scanner;

public class Q04LD {

	public static void main(String[] args) 
	/*
	 Fa�a um programa em que permita a entrada de um n�mero qualquer
	 e exiba se este n�mero � par ou �mpar. 
	 Se for par exiba tamb�m a raiz quadrada do mesmo;
	 se for �mpar exiba o n�mero elevado ao quadrado.
	 Scanner � importa��o da biblioteca
	 */
	{
	//Declara��o de Vari�veis
		int A;
		double B;
	//Leitura de Dados
		Scanner read=new Scanner(System.in);
		System.out.println("\nInsira um n�mero: ");
		A=read.nextInt();
		
	//Verificar se � par ou �mpar
		if(A%2==0)
		{
			B=Math.sqrt(A);
			System.out.printf("\nO n�mero %d � par, e sua raiz � %.3f",A,B);
		}
		else
		{
			B=Math.pow(A, 2);
			System.out.printf("\nO n�mero %d � �mpar, e seu quadrado � %.0f.",A,B);
		}

	}

}
