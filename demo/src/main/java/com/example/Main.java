import java.io.*;
import java.util.Scanner;

//Escrita de Arquivos em JAVA
//Desafio 3 - Gera apenas hosts críticos
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("//C://Users//Downloads//ativos.csv/"));
            BufferedWriter escritorCriticos = new BufferedWriter(new FileWriter("hosts_criticos.csv"));

            String linha = leitor.readLine();
            escritorCriticos.write(linha + ", criticidade");
            escritorCriticos.newLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                String criticidade;
                if (so.contains("Kali")) {
                    criticidade = "Alta";
                } else if (so.contains("Ubuntu") || so.contains("Debian") || so.contains("Rocky")) {
                    criticidade = "Baixa";
                } else {
                    criticidade = "Media";
                }

                if ("Alta".equals(criticidade)) {
                    escritorCriticos.write(host + "," + ip + "," + so + "," + criticidade);
                    escritorCriticos.newLine();
                }
            }

            leitor.close();
            escritorCriticos.close();

            System.out.println("Arquivo de hosts críticos gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}