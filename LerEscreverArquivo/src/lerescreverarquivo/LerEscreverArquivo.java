/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lerescreverarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class LerEscreverArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            writeNIO();
            readNIO();
            writeIO();
            readIO();
            writeNIO();
            readNIO();
        } catch (IOException ex) {
            Logger.getLogger(LerEscreverArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String filePath = "C:\\Users\\aluno\\Documents\\Java\\arquivo.txt";

    //================
    //USANDO JAVA NIO - Escrever e ler arquivos de forma não bloqueante 
    //================
    private static void writeNIO() throws IOException {
        System.out.println(filePath);

        StringBuilder texto = new StringBuilder();
        texto.append( "AAA\nBBB\nCCC");
        //abre novo arquivo e escreve
        //Files.write(Path.of(filePath), "AAA\nBBB\nCCC".getBytes()); 

        //abre arquivo e adiciona mantendo os dados anteriores
        Files.write(Path.of(filePath), texto.toString().getBytes(), StandardOpenOption.CREATE);

    }

    private static void readNIO() throws IOException {
        Path path = Paths.get(filePath);
        System.out.println(path);
        List<String> textos = Files.lines(path).toList(); //lê para uma lista
        //Files.lines(path).forEach(line -> System.out.println(line)); 
        for (String s : textos) {
            System.out.println(s);
        }
    }

    //USANDO Java IO - Leitura bloqueante
    //===================================
    public static void writeIO() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write("DDD");
            bw.newLine();
            bw.write("EEE.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readIO() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
