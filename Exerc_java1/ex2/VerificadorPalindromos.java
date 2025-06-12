package ex2;

public class VerificadorPalindromos {

    public static boolean palindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        int esquerda = 0;
        int direita = texto.length() - 1;
        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
