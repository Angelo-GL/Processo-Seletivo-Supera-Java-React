package Desafio04;

import java.util.Scanner;

public class Desafio04 {
    public Desafio04(){
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
    }

    public static String lerLinha(Scanner ler){
        String linha = ler.nextLine();
        while(linha.isEmpty()){
            linha = ler.nextLine();
        }
        return linha;
    }
   
}


