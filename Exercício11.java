/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercicio11 {
    public static void main(String[] args) {
        // Definir os três lados do triângulo
        double lado1 = 6;
        double lado2 = 4;
        double lado3 = 5;

        // Verificar se os lados formam um triângulo válido
        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            
            // Classificação do triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero (todos os lados iguais)");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles (dois lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes)");
            }

        } else {
            System.out.println("Os valores informados não formam um triângulo válido!");
        }
    }
}

