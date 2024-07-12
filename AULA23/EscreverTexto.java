package AULA23;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscreverTexto {
    public static void main(String[] args){
        try{
            BufferedWriter arquivotexto = new BufferedWriter(new FileWriter("./programacao-diony/src/AULA23/texto.txt"));
            for(int i=0;i<10;i++){
                arquivotexto.append("Linha "+i+"do arquvo \n");
            }
            arquivotexto.close();
        }catch (FileNotFoundException e){
            System.out.println("Erro ao escrever o arquivo");
        }catch( IOException e){
            System.out.println("Erro ao criar o arquivo.");
        }
    }
}
