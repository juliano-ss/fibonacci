/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci;

/**
 *
 * @author jotal
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        
        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        while (proximo < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        
        if (proximo == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

