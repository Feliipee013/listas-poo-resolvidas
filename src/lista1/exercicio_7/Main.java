package lista1.exercicio_7;

public class Main {
    public static void main(String[] args) {
        String senha1 = "senha12345";
        String senha2 = "senha";
        String senha3 = "1234541241241";

        Autenticador autenticador = new Autenticador();
        autenticador.validar(senha1);
        autenticador.validar(senha2);
        autenticador.validar(senha3);
    }
}
