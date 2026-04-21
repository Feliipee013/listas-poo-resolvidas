package lista_02.exercicio_06;

import java.util.Scanner;

public class Tabuada {
    Scanner teclado = new Scanner(System.in);

    public void imprimirTabuada(){
        int numero;
        Boolean valido = true;
        int resultado;
        while(valido){
        System.out.println("Coloque o número que você quer ver a tabuada de multiplicação:");
        numero = teclado.nextInt();

        if(numero>0 && numero<=10){
            for(int i=1;i<=10;i++){
                resultado = numero * i;
                System.out.println(numero + "x" + i + "=" + resultado);
                System.out.println("------------------------------------------");
            }
            valido = false;
        }else{
            System.out.println("Número inválido, fora do intervalo...coloque o número correto");
            System.out.println();
        }
        
        }
    }
}
