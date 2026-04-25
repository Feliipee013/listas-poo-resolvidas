package lista_03.exercicio_05;

public class Dado {
    // foi criado um arranjo de 7 posições para que eu ficasse mais intuitivo
    // já que uso de 1 a 6 para armazenar quantas vezes caiu em cada -- a posição zero é ignorada.
    // obs.: em java os arranjos/ atributos de classes são inicializados com valores padrões para cada tipo
    //(exceto se vc explicitamente inicializar eles com outros valores). Para int o padrão é 0; logo temos
    // um arranjo de 7 posições com 0.
    int[] array = new int[7];

    public void lancarDado() {
        for (int i = 0; i < 6000; i++) {
            /* O 'Math.random()' retorna um valor double no intervalo [0.0,1.0),
            logo é necessário multiplicar por 6 e somar mais 1 para podermos ter um valor maior q 6.

            Como queremos um int, precisamos fazer um cast explícito de um double para int.
            Fazemos o cast com o (int)
             */
            int face = (int) (Math.random() * 6.0 + 1.0);
            // aqui pega a face que cair e incrementa na posição do array. Por exemplo, o primeiro
            // lançamento caiu 1, então vai na posição 1 do array e aumenta mais 1 (antes era 0 e agr ficará 1)
            array[face]++;


           /*
              Outra função da classe Math é a Math.floor que vai arredondar para baixo o valor que cair,
              porem ainda retorna um double, poderíamos fazer um cast tbm e fazer o 'array[face]++',
              mas n faria tanto sentido, já que conseguimos pegar a parte q nos interessa com o cast.
              Outra alternativa é fazer:
              if(face == 1.0) array[1]++;
              else if(face == 2.0) array[2]++;
              e assim por diante, porém é mais processamento sem necessidade.
            */
//           double face = Math.floor(Math.random() * 6.0 + 1.0);
        }

        for (int i = 1; i < array.length; i++) {
            System.out.println("Caiu na face " + i + ": " + array[i] + " vezes");
        }
    }
}
