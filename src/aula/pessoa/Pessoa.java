package aula.pessoa;

public class Pessoa {

    String nome;
    int idade;
    String cpf;

    public void correr() {
        System.out.println(this.nome + " esta correndo");
        System.out.println("idade " + this.idade);
        System.out.println("cpf " + this.cpf);
    }
}

