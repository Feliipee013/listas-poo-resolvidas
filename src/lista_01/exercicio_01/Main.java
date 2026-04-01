package lista_01.exercicio_01;

public class Main {
    public static void main(String[] args) {
        SimuladorFinanciamento simuladorFinanciamento = new SimuladorFinanciamento();
        // salário <= 30%
        simuladorFinanciamento.analisarEmprestimo(100, 30);
        // salário > 30%
        simuladorFinanciamento.analisarEmprestimo(100, 31);
    }
}
