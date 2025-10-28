/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercício18 {

    public static void main(String[] args) {

        double VelocidadeCarro = 110;
        double multa = (VelocidadeCarro - 120) * 10;

        if (VelocidadeCarro >= 120) {
            System.out.println("Velocidade acima do limite");
            System.out.println("Valor da multa: R$" + multa);
        }

    }
}
