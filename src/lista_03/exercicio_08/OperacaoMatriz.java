package lista_03.exercicio_08;

public class OperacaoMatriz {

    public void somaMatriz() {
        int[][] matriz1 = { { 4, 6 }, { 5, 7 } };
        int[][] matriz2 = { { 2, 6 }, { 8, 4 } };
        int[][] matriz3 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
        System.out.println("Matriz 2");
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println();
        System.out.println("Matriz 3");
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println("]");
        }
    }

}
