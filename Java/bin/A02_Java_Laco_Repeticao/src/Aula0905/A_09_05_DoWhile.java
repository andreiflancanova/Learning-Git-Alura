package Aula0905;

import java.util.Scanner;

public class A_09_05_DoWhile 
{

	public static void main(String[] args) 
	{
		// Declara��o de Vari�veis
		int N,QPar=0,QImpar=0;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("\nInsira um n�mero inteiro positivo: ");
			N = input.nextInt();
			if(N%2==0)
			{
				QPar++;
			}
			else
			{
				QImpar++;
			}
		}
		while(QPar!=3);
		System.out.println("\nA quantidade de n�meros �mpares � "+QImpar+".");
		System.out.println("\nA quantidade de n�meros pares � "+QPar+".");

	}

}
