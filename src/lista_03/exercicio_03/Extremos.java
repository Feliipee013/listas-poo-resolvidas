package lista_03.exercicio_03;

public class Extremos {
    public void buscar(int[] array) {
        //consideramos que o primeiro elemento é o maior e menor no inicío, e aí podemos percorrer
        //o array a partir do segundo
        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            } else if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
