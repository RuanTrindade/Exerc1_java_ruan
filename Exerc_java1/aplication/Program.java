package aplication;

import ex1.Calculadora;
import ex2.VerificadorPalindromos;
import ex3.FatorialRecursivo;
import ex4.ConversorTemperatura;
import ex5.MaiorMenor;
import ex7.ValorContainer;
import ex8.Funcionario;
import ex9.Contato;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Ex1: Calculadora
        System.out.println("Exercicio 1");
        Calculadora calc = new Calculadora();
        System.out.println("Soma 2 + 3 = " + calc.somar(2, 3));

        System.out.println();

        // Ex2: Palindromo
        System.out.println("Exercicio 2");
        VerificadorPalindromos p = new VerificadorPalindromos();
        System.out.println("arara é palíndromo? " + p.palindromo("arara"));

        System.out.println();

        // Ex3: Fatorial
        System.out.println("Exercicio 3");
        FatorialRecursivo f = new FatorialRecursivo();
        System.out.println("Fatorial de 5 = " + f.calcular(5));

        System.out.println();

        // Ex4: Conversor
        System.out.println("Exercicio 4");
        ConversorTemperatura ct = new ConversorTemperatura();
        System.out.println("100ºC em F = " + ct.celsiusParaFahrenheit(100));

        System.out.println();

        // Ex5: Maior e Menor na matriz
        System.out.println("Exercicio 5");
        System.out.println("Digite qtd de linhas: ");
        int lin = sc.nextInt();
        System.out.println("Digite qtd de colunas: ");
        int col = sc.nextInt();

        int [][] matriz = new int[lin][col];

        System.out.println("Digite os elementos das matriz: ");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        int mai = MaiorMenor.maior(matriz);
        int men = MaiorMenor.menor(matriz);
        System.out.println("Maior elemento da matriz: " + mai);
        System.out.println("Menor elemento da matriz: " + men);

        System.out.println();

        //Ex6
        System.out.println("Exercicio 6");
        System.out.println("Informe a ordem da matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matrizQuadrada = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matrizQuadrada[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = ex6.SomaDiagonais.somaDiagonalP(matrizQuadrada);
        int somaSecundaria = ex6.SomaDiagonais.somaDiagonalS(matrizQuadrada);

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        System.out.println();

        // Ex7: Trocar valores
        System.out.println("Exercicio 7");
        ValorContainer a = new ValorContainer();
        ValorContainer b = new ValorContainer();
        a.valor = 10;
        b.valor = 20;
        ValorContainer.trocarValores(a, b);
        System.out.println("A: " + a.valor + " B: " + b.valor);

        System.out.println();


        // Ex8: Funcionarios
        System.out.println("Exercicio 8");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 1, 3000, "TI"));
        funcionarios.add(new Funcionario("Maria", 2, 3500, "RH"));
        double somaTI = funcionarios.stream()
                .filter(fu -> fu.getDepartamento().equalsIgnoreCase("TI"))
                .mapToDouble(Funcionario::getSalario)
                .sum();
        System.out.println("Salário total TI: R$" + somaTI);
        funcionarios.forEach(Funcionario::exibir);

        System.out.println();

        // Ex9: Contatos
        System.out.println("Exercicio 9");
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Ana", "9999-0000", "ana@email.com"));
        contatos.add(new Contato("Carlos", "8888-1111", "carlos@email.com"));
        contatos.forEach(Contato::exibir);
        System.out.print("Buscar nome: ");
        String busca = sc.next();
        contatos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(busca))
                .forEach(c -> System.out.println("Telefone: " + c.getTelefone() + ", Email: " + c.getEmail()));

        sc.close();
    }
}
