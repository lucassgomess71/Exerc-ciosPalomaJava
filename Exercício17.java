/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Exercício17 {

    public static void main(String[] args) {

        int ano = 2024;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("e um ano bissexto");
        } else {
            System.out.println("nao e um ano bissexto");
        }

    }
}
