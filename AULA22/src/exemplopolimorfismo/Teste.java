package AULA22.src.exemplopolimorfismo;

public class teste{
    public static void main(String[] args){
        Operacoes op = new Operacoes(){
            System.out.println("Domando dois números "+op.soma(5,7));
            System.out.println("Domando três números "+op.soma(5,7,9));
            System.out.println("Domando duas strings "+op.soma("palavra", "teste"));
        }
    }
}