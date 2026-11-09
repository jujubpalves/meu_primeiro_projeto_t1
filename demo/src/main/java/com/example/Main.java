import java.io.*;
import java.util.Scanner;

//Escrita de Arquivos em JAVA
//Desafio 2 - Contador de sistemas operacionais
public class Main {
    public static void main(String[] args) throws IOException {
        int contWindows = 0;
        int contLinux = 0;
        int contMac = 0;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("/C://Users//56576890893//Downloads//ativos.csv/"));
            String linha = leitor.readLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String so = dados[2].toLowerCase();

                if (so.contains("windows")) {
                    contWindows++;
                } else if (so.contains("linux") || so.contains("ubuntu") || so.contains("debian") || so.contains("rocky") || so.contains("kali")) {
                    contLinux++;
                } else if (so.contains("mac") || so.contains("macos")) {
                    contMac++;
                }
            }
            leitor.close();

            System.out.println("Total Windows: " + contWindows);
            System.out.println("Total Linux: " + contLinux);
            System.out.println("Total macOS: " + contMac);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}