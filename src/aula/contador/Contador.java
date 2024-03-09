package aula.contador;

public class Contador {
        double valor;

        public void incrementar(){
            this.valor++;
        }
        public void decrementar(){
            this.valor--;
        }
        public void exibirValor(){
            System.out.println("O valor atual é: " + this.valor);
        }
}
