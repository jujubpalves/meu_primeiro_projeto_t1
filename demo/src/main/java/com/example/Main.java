package com.example;
import  java.util.Scanner;
//Exercício 2: Busca de Caracteres em um Vetor
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char[] meuNome = {'J', 'U', 'L', 'I', 'A'};

        System.out.println("Informe a letra que deseja buscar: ");

        char letraUsuario = entrada.next().charAt(0);

        for(int i = 0; i< meuNome.length; i++){
            if(meuNome[i] == letraUsuario ){
                System.out.println("Achada a letra " + letraUsuario + " na posição " + i);
            }

        }

    }
}