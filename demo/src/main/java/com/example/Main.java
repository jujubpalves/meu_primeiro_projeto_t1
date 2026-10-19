package com.example;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Scanner;
import java.io.File;

//Exercício 3: Contagem de Valores Booleanos

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        File arquivo = new File("exemplo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo já existe. ");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar arquivo. ");
                }
            } catch (IOException e) {
                System.out.println("Erro ao manipular o arquivo! ");
            }
        }
        FileWriter escritor = new FileWriter("teste.txt");
        escritor.write("Olá, Julia!");
        escritor.close();

    }
}