package Lista0605;

import java.util.Scanner;

public class Q01PS 
{

	public static void main(String[] args) 
	{
		/*	ENUNCIADO
		1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
		*/
		
		//Declara��o de Vari�veis
		int A,M,D,ID;
		
		Scanner leia1 = new Scanner(System.in);
		//Leitura de dados
		{
			System.out.println("\nInsira o n�mero de anos de idade completos que voc� tem: ");
			A=leia1.nextInt();

			System.out.println("\nInsira o n�mero de meses completos desde o seu �ltimo anivers�rio: ");
			M=leia1.nextInt();

			System.out.println("\nInsira o n�mero de dias desde o seu �ltimo mesvers�rio: ");
			D=leia1.nextInt();
			
		}
		//C�lculo da idade em dias
		ID=A*365+M*30+D;
		
		//Imprimir o resultado de ID
		System.out.println("\nSua idade expressa em dias vale "+ID);
	}

}
