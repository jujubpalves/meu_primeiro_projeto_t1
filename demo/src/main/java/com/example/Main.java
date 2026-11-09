import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Escrita de Arquivos em JAVA
//Desafio 4 - Adicionar data da auditoria
public class Main {
    public static void main(String[] args) throws IOException {
        String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("/C://Users//Downloads//ativos.csv/"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("inventario_auditado.csv"));

            String linha = leitor.readLine();
            escritor.write(linha + ", data_auditoria");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                escritor.write(host + "," + ip + "," + so + "," + dataAtual);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório com data de auditoria gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}