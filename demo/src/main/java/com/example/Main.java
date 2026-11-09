import java.io.*;
import java.util.Scanner;

//Escrita de Arquivos em JAVA
//Desafio 1 - Adicionar coluna Status
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("/C://Users//56576890893//Downloads//ativos.csv/"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("inventario_atualizado.csv"));

            String linha = leitor.readLine();
            escritor.write(linha + ", status");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                String status;
                if (so.toLowerCase().contains("windows")) {
                    status = "Online";
                } else if (so.toLowerCase().contains("linux") || so.contains("Ubuntu") || so.contains("Debian") || so.contains("Rocky") || so.contains("Kali")) { //[cite: 15, 19]
                    status = "Em Monitoramento";
                } else {
                    status = "Desconhecido";
                }

                escritor.write(host + "," + ip + "," + so + "," + status);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();
            System.out.println("Relatorio gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}