package ex7;

public class ValorContainer {

    public int valor;

    public ValorContainer() {
    }

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public static void trocarValores(ValorContainer a, ValorContainer b) {
        int temp = a.valor;
        a.valor = b.valor;
        b.valor = temp;
    }
}
