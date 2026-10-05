package com.example;

//Exercício 1: Soma de Elementos Inteiros em um Vetor
public class Main {
    public static void main(String[] args) {

        int [] valores = {4,8, 10 ,2, 4};
        int soma= 0;

        for(int i = 0; i < 5; i++ ){
            soma += valores[i]; //soma = soma + valores[i];

        }

        System.out.println("A soma é de: " + soma);


    }
}