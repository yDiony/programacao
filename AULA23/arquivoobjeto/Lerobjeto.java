package AULA23.arquivoobjeto;

import java.io.*;

public class Lerobjeto {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/Diony/Documents/aula23_tarde");
        File arquivo = new File(caminho,"pessoa.db");
        try{
            ObjectInputStream arquivoObj = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa[] lista =(Pessoa[]) arquivoObj.readObject();
            int cont =0;
            Pessoa p;

            do{
                p=lista[cont];
                if(p!=null){
                    cont++;
                }
            }while(p!=null);

            for(int i=0;i<cont; i++){
                System.out.println(lista[i]);
            }
            arquivoObj.close();
        }catch(IOException e){
            System.out.println("Errou ao ler o arquivo");
        }catch (ClassNotFoundException e){
            System.out.println("Classe não encontrada");
        }
    }
}

