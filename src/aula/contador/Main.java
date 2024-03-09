package aula.contador;

import aula.claculadora.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Contador Contador1 = new Contador();

        System.out.println("Digite o valor: ");
        Contador1.valor = leia.nextDouble();
        Contador1.incrementar();
        Contador1.exibirValor();

        Contador1.decrementar();
        Contador1.exibirValor();

    }
}
