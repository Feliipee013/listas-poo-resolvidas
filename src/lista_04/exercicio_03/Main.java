package lista_04.exercicio_03;

public class Main {
    public static void main(String[] args) {
        CalculadoraGeometrica calculadoraGeometrica = new CalculadoraGeometrica();

        calculadoraGeometrica.calcularArea(2);
        calculadoraGeometrica.calcularArea(2, 3);
        calculadoraGeometrica.calcularArea("Elipse",2);
        calculadoraGeometrica.calcularArea("CiRcULo",3);
    }
}
