package lista_03.exercicio_06;

public class PassagemArray {

    public void multiplicarValores(int[] arr){
        System.out.println("Array antes da troca:");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] * 2;
        }
        System.out.println();
        System.out.println("Array depois da troca:");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}
