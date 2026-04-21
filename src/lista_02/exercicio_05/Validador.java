package lista_02.exercicio_05;

import java.util.Scanner;

public class Validador {

    public void pedirSenha() {
        Scanner sc = new Scanner(System.in);
        boolean acertou = false;

        while(!acertou) {
            System.out.println("Digite uma senha:");
            String senha = sc.nextLine();

            if(!senha.equals("1234")) {
                System.out.println("Senha incorreta, tente novamente");
            } else {
                acertou = true;
            }
        }
    }
}
