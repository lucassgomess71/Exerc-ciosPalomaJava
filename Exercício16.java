/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercicio16 {
    public static void main(String[] args) {
        
        //Entrada
        int numero1 = 1;
        int numero2 = 2; 

        //Processamento
        if (numero1 > numero2) {
            System.out.println("O maior numero e: " + numero1);
            System.out.println("O menor numero e: " + numero2);
            System.out.println("Eles sao diferentes.");
        } else if (numero1 < numero2) {
            System.out.println("O maior numero e: " + numero2);
            System.out.println("O menor numero e: " + numero1);
            System.out.println("Eles sao diferentes.");
        } else {
            System.out.println("Os dois numeros sao iguais: " + numero1);
        }
    }
}

