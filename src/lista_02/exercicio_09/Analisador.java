package lista_02.exercicio_09;

public class Analisador {
    public void somarPare(int limiteMaximo) {
        int contador = 0;
        if(limiteMaximo < 0) {
            System.out.println("Digite um número positivo");
        } else {
            for(int i = 0; i <= limiteMaximo; i++) {
                if(i % 2 == 0) {
                    contador += i;
                }
            }
            System.out.println("A soma de todos os pares de 0 até " + limiteMaximo + " é: " + contador);
        }

    }
}
