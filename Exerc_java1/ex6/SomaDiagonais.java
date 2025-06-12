package ex6;

public class SomaDiagonais {

    public static int somaDiagonalP(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int somaDiagonalS(int[][] matriz){
        int soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            soma += matriz[i][n - 1 - i];
        }
        return soma;
    }
}
