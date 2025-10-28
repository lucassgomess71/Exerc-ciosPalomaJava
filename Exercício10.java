/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercicio10 {
     public static void main(String[] args) {
        // Definir peso (kg) e altura (m)
        double peso = 82;
        double altura = 1.75;

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Classificação
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        // Exibir resultados
        System.out.printf("Peso: %.1f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);
    }
}
    

