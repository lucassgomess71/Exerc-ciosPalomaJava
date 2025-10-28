/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercicio9 {
    public static void main(String[] args) {
        
        // valor da compra 
        double valorCompra = 100;
        double desconto;

        if (valorCompra >= 100) {
            desconto = 0.10;
        } else {
            desconto = 0.05;
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor final a pagar: R$ " + valorFinal);
    }
}

    

