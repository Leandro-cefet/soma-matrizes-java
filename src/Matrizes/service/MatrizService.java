package Matrizes.service;

import javax.swing.JOptionPane;

public class MatrizService {

    // Método para ler os valores da matriz A e B
	
    public static void lerMatriz(int[][] matriz, String nomeMatriz) {

        for (int linha = 0; linha < 2; linha++) 
        {

            for (int coluna = 0; coluna < 2; coluna++) 
            {

                boolean entradaValida = false;

                while (!entradaValida) 
                {

                    try 
                    {

                        String entrada = JOptionPane.showInputDialog("Digite o valor da posição [" + linha + "][" + coluna + "] da Matriz "+ nomeMatriz + ":");

                        matriz[linha][coluna] =Integer.parseInt(entrada);

                        entradaValida = true;

                    } 
                    
                    catch (NumberFormatException erro) 
                    {

                        JOptionPane.showMessageDialog(null, "Erro! Digite apenas números inteiros.");
                    }
                }
            }
        }
    }

    // Método para somar os valores das matrizes
    
    public static int[][] somarMatrizes(int[][] matrizA,int[][] matrizB) 
    {
    	int[][] matrizResultado = new int[2][2];

        for (int linha = 0; linha < 2; linha++) 
        {

            for (int coluna = 0; coluna < 2; coluna++) 
            {

                matrizResultado[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }

        return matrizResultado;
    }
}
