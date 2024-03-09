package aula.pessoa;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Randerson";
        pessoa1.idade = 19;
        pessoa1.cpf = "132.486.778-91";
        pessoa1.correr();
        System.out.println(pessoa1.nome);

    }
}
