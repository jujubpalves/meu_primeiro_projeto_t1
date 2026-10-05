package com.example;
import  java.util.Scanner;

//Exercício 3: Contagem de Valores Booleanos

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean[] byteUsuario = new boolean[8];
        int contadorTrue = 0;

        for(int i =0; i < byteUsuario.length; i++){
            System.out.println("Informe true ou false para o bit[ " + i + " ]");
            byteUsuario[i] = entrada.hasNextBoolean();
            if(byteUsuario[i] == true) contadorTrue++;
        }

        System.out.println("Quant. de true no byte : " + contadorTrue);

    }
}