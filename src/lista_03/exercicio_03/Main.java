package lista_03.exercicio_03;

public class Main {

    public static void main(String[] args) {
        Extremos extremos = new Extremos();
        //instanciando o array e já inicializando ele. Poderia ter criado fora e só passado a variável
        // pro método
        extremos.buscar(new int[]{-10, 0, 20, 30, -20, 50});
    }
}
