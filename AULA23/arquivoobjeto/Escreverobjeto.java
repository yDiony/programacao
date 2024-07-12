package AULA23.arquivoobjeto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Escreverobjeto {
    public static void main(String[] args) {

        File caminho = new File("C:/Users/Diony/Documents/aula23_tarde");

        if(caminho.exists()){
            System.out.println("A pasta existe.");
        }else{

            caminho.mkdirs();
            System.out.println("Caminho criado.");
        }

        File arquivo = new File(caminho,"pessoa.db");

        System.out.println(arquivo.getAbsolutePath());
        try{
            ObjectOutputStream arquivoObj =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa[] lista = new Pessoa[10];
            Scanner ler = new Scanner(System.in);
            String opc;
            int cont=0;
            do{
                System.out.println("Lendo informação da Pessoa: "+(cont+1));
                System.out.println("Qual o nome: ");
                String nome = ler.next();
                System.out.println("Qual o sobrenome: ");
                String sobrenome = ler.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.println("Tem mais Pessoa? (s/n)");
                opc = ler.next().toLowerCase();
                cont++;
            }while(opc.equals("s"));
            arquivoObj.writeObject(lista);
            arquivoObj.close();
        }catch(IOException e){
            System.out.println("Erro ao criar o arquivo");
        }
    }
}