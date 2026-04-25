package lista_04.exercicio_03;

public class CalculadoraGeometrica {

    public void calcularArea(double l) {
        System.out.println("A área do quadrado é: " + (l * l));
    }

    public void calcularArea(double l, double h) {
        System.out.println("A área do retângulo é: " + (l * h));
    }

    public void calcularArea(String forma, double r) {
        // usando o trim() para remover os espaços em branco do começo e fim e o toLoweCase()
        // para deixar a string passada em minúsculo. Por fim, o .equals() para checar se é igual a círculo.
        if (forma.trim().toLowerCase().equals("circulo")) {
            // usando o String.format() para deixar o resultado com duas casas decimais
            // tem o System.out.printf que seria a mesma maneira do c
            //System.out.printf("A area do círculo é: %.2f", (Math.PI * r* r));
            System.out.println("A área do círculo é: " + String.format("%.2f", Math.PI * r * r));
        } else {
            System.out.println("A forma tem que ser um circulo");
        }
    }
}
