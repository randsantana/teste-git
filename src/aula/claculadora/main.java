package aula.claculadora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double soma,subtrair,multiplicar,dividir,n1,n2 = 0;
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro número");
        n1 = leia.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = leia.nextDouble();

        //Soma
        soma = calculadora.somar(n1,n2);
        System.out.println("Soma: " + soma);

        //Subtrair
        subtrair = calculadora.subtrair(n1,n2);
        System.out.println("Subtrair: " + subtrair);

        //Multiplicar
        multiplicar = calculadora.multiplicar(n1,n2);
        System.out.println("Multiplicar: " + multiplicar);

        //Dividir
        dividir = calculadora.dividir(n1,n2);
        System.out.println("Dividir: " + dividir);
    }
}
