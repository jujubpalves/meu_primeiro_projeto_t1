package com.example;

//Exercício 1: Soma de Elementos Inteiros em um Vetor
public class Main {
    public static void main(String[] args) {

        int [] valores = {4,8, 10 ,2, 4, 2};
        int soma= 0;

        System.out.println("A soma de ");

        for(int i = 0; i < valores.length; i++ ){
            soma += valores[i]; //soma = soma + valores[i];
            System.out.print(valores[i]);
            if(i == 5) break;
            System.out.print(" + ");
        }


        System.out.println(" = " + soma);


    }
}