package lista_01.exercicio_03;

public class Main {
    public static void main(String[] args) {
        // criando um objeto Paciente e definindo peso e altura
        Paciente paciente = new Paciente();
        paciente.altura = 1.80;
        paciente.peso = 72;

        // chamando o método diagnosticar
        paciente.diagnosticar();
    }
}
