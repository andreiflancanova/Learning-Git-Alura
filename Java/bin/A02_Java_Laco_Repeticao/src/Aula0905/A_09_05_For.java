package Aula0905;

import java.util.Scanner;

public class A_09_05_For {

	public static void main(String[] args) {
		// Declara��o de Vari�veis
		float N1,N2,N3,Med,MedG,SumMed=0;
		int x;
		
		Scanner input =new Scanner(System.in);
		
		//La�o de Repeti��o
		for (x=1;x<=4;x++)
		{
			System.out.println("\nInsira a primeira nota: ");
			N1=input.nextFloat();
			
			System.out.println("\nInsira a segunda nota: ");
			N2=input.nextFloat();
			
			System.out.println("\nInsira a terceira nota: ");
			N3=input.nextFloat();
			
			Med=(N1+N2+N3)/3;
			
			System.out.printf("\nA M�dia Aritm�tica do alune %d foi de %.2f: ",x,Med);
			SumMed+=Med;
		}

		MedG=SumMed/4;
		System.out.printf("\nA M�dia Geral da turma foi de %.2f: ",MedG);
	}

}
