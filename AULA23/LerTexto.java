package AULA23;

import java.io.*;

public class LerTexto {
    public static void main(String[] args){
        try{
            BufferedReader arquivotexto = new BufferedReader(new FileReader("./programacao-diony/src/AULA23/texto.txt"));
            String texto = "";
            String linha = "";
            while(linha!=null){
                linha = arquivotexto.readLine();
                if(linha!=null){
                    texto += linha + "\n";
                }

            }

        System.out.println(texto);
        arquivotexto.close();
    }catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
