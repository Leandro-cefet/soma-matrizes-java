package Matrizes.app;

import javax.swing.JOptionPane;

import Matrizes.service.MatrizService;

public class ProgramaMatriz {

    public static void main(String[] args) {

        // Criação das matrizes A e B
    	
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];

        // Leitura da matriz A
        
        JOptionPane.showMessageDialog(null, "Digite os valores da Matriz A");

        MatrizService.lerMatriz(matrizA, "A");

        // Leitura da matriz B
        
        JOptionPane.showMessageDialog(null, "Digite os valores da Matriz B");

        MatrizService.lerMatriz(matrizB, "B");

        // Soma das matrizes A e B
        
        int[][] matrizResultado = MatrizService.somarMatrizes(matrizA, matrizB);

        // Mostrar resultado
        
        String resultado = "MATRIZ RESULTADO\n\n";

        for (int linha = 0; linha < 2; linha++) 
        {

            for (int coluna = 0; coluna < 2; coluna++) 
            {

                resultado += matrizResultado[linha][coluna] + " ";
            }

            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}