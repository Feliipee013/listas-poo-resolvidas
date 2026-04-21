package lista_02.exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        int opcao = -1;
        do {
            menu.exibirMenu();
            opcao = sc.nextInt();
        } while(opcao != 0);

    }
}
