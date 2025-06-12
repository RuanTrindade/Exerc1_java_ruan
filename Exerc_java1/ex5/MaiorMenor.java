package ex5;

public class MaiorMenor {

    public static int maior(int[][] matriz){
        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior){
                    maior = valor;
                }
            }
        }
        return maior;
    }

    public static int menor(int[][] matriz){
        int menor = matriz[0][0];
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor < menor){
                    menor = valor;
                }
            }
        }
        return menor;
    }
}
