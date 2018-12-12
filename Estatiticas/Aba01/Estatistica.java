
package Matematica;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
public class Estatistica {
   
    public static void main(String[] args) {
  
		double valoresVenda[] = { 1, 46, 49, 51, 54,54, 59, 59, 60, 60, 61, 61, 62, 65, 66, 66, 67, 67, 69, 70, 70, 71,
				72, 74, 74, 76, 79, 80, 82, 87, 88 };

		System.out.print("\nQuantidades de vendas: " + "\n");
		Arrays.sort(valoresVenda);
		for (int i = 0; i < valoresVenda.length; i++) {

			System.out.printf("%.0f%n", valoresVenda[i], "\n");
		}

		System.out.print("\nNúmeros Xi: " + "\n");

		// compiar o array e remover os números repetidos
		double[] unicos = new double[valoresVenda.length];
		int qtde = 0;
		for (int i = 0; i < valoresVenda.length; i++) {
			boolean existe = false;
			for (int j = 0; j < qtde; j++) {

				if (unicos[j] == valoresVenda[i]) {
					existe = true;
					break;
				}
			}
			if (!existe) {
				unicos[qtde++] = valoresVenda[i];
			}
		}
		// retirar as posições do array que não foram usadas
		unicos = Arrays.copyOf(unicos, qtde);

		// imprime o resultado
		for (int i = 0; i < unicos.length; i++) {
			System.out.printf("%.0f%n", unicos[i]);

		}
		// Codigo para os calculos de quantas vezes o numero de vendas se repetiu
		System.out.println("\nQuantidades Ni:");
		int cont = 1;
		int soma = 0;
		int soma1 = 0;
		double numeros = 0;
		double vetCONTADOR[] = new double[valoresVenda.length]; // criando vetor CONTADOR com o
		// //tamanho de 31 que é a quantidade
		// //de valores

		for (int i = 0; i < unicos.length; i++) {
			cont = 0;

			for (int j = 0; j < valoresVenda.length; j++) {
				if (unicos[i] == valoresVenda[j]) {
					cont++;

				}
			}
			System.out.println(cont); // imprime a qtde de vezes que o número de vendas se repetiu

			vetCONTADOR[i] = cont; // vetor CONTADOR recebendo cada posição do cont

			soma += cont;
		}
		System.out.println("Total: " + soma);// imprime o soma da qtdede vezes que o numero se repetiu

		// Codigo para os calculos de Xi vezes Ni
		System.out.println("\nXi x Ni:");
		for (int i = 0; i < unicos.length; i++) {
			cont = 0;

			for (int j = 0; j < valoresVenda.length; j++) {
				if (unicos[i] == valoresVenda[j]) {
					cont++;
					numeros = unicos[i] * cont;
				}
			}
			System.out.println(numeros);// imprime a multiplicaçao de Xi vezes Ni
			soma1 += numeros;
		}
		System.out.println("Total: " + soma1);// imprime a soma de Xi vezes Ni

		// Calculos para achar as porcentagens de Ni dividido pelo o total vezes 100
		System.out.println("\nPorcentagens de valores:");
		double somaPercent = 0;
		int vetcontador = vetCONTADOR.length; // jogando o tamanho do vetor na variável
		double vetPorcentagem[] = new double[unicos.length];

		for (int i = 0; i < unicos.length; i++) {

			vetPorcentagem[i] = (vetCONTADOR[i] / soma) * 100; // fazendo a conta do 100*fi

			System.out.printf("%.2f %%\n", vetPorcentagem[i]);// imprimindo as porcentagens

			somaPercent += vetPorcentagem[i];

		}
		System.out.printf("Total: %.2f %%", somaPercent);// imprimindo o total das porcentagens
		System.out.println("\n");

		double media = 0;
		for (int i = 0; i < valoresVenda.length; i++) {
			media += valoresVenda[i] / soma;

		}

		// Calculos finais: pegar a media menos o Xi elevado a 2 vezes Ni
		System.out.println("Valores Finais:");
		double somaFinal = 0;
		double[] vetFinal = new double[unicos.length];
		for (int i = 0; i < unicos.length; i++) {
			vetFinal[i] = ((media - unicos[i]) * (media - unicos[i]) * vetCONTADOR[i]);

			System.out.printf("%.0f\n", vetFinal[i]);// imprimindo o resultado
			somaFinal += vetFinal[i];
		}

		System.out.printf("Total: %.0f", somaFinal);// imprimindo o total
		System.out.println("\n");
		System.out.printf("Média: %.2f\n", media);

		System.out.println("Moda: ");

		for (int i = 0; i < valoresVenda.length; i++) {
			double moda = 0;
			for (int j = 0; j < valoresVenda.length; j++) {
				if (valoresVenda[i] == valoresVenda[j] && i != j) {
                                    
					moda += valoresVenda[i];
                                        
                                        
					System.out.println(moda);
				}

			}

		}
		int valoresNumeros = valoresVenda.length % 2;
		double mediana = 0;
		double mediana1 = 0;

		if (valoresNumeros == 1) {
			mediana = valoresVenda[((valoresVenda.length + 1) / 2) - 1];
			System.out.println("Mediana: " + mediana);
		} else {
			int num = valoresVenda.length / 2;
			mediana1 = (valoresVenda[num - 1] + valoresVenda[num]) / 2;
			System.out.println("Mediana: " + mediana1);
                         
		}
		double variancia = 0;
		double desvioPadrao = 0;
		variancia = somaFinal / soma;
		System.out.printf("Variância: %.2f ", variancia);

		desvioPadrao = Math.sqrt(variancia);
		System.out.printf("\nDesvio Padrão: %.2f ", desvioPadrao);
                
               
	}
            
                    
}

        
        
        
        
        
        
        
        
        
        
    
    

