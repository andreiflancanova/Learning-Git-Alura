package Lista0905_Lacos_Repeticao;

public class Q01_For_Lista_09_05 
{
	/*	Informar todos os n�meros de 1000 a 1999 que,
	 * 	quando divididos por 11, obtemos resto = 5.

	 */
	public static void main(String[] args) 
	{
		// Declara��o de Vari�veis
		int N,C=0;

		//Loop For de 1000 at� 1999
		for (N=1000;N<=1999;N++)
		{
			//Estrutura para ele quebrar de linha de 10 em 10
			//Utilizando if
			
			if(N==1000)
			{
				System.out.print(" "+N+", ");
				C++;
			}
			else if (N%11==5)
			{
				if (C%11==0 && N!=1006)
				{
					System.out.print("\n "+N+", ");
				}
			
				else
				{
					System.out.print(+N+", ");
				}
				C++;
			}
			else if(N==1999)
			{
				System.out.print(+N+". ");
			}
			
			else
			{
				
			}
			
		}

	}

}
