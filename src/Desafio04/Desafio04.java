package Desafio04;

import java.util.Scanner;

public class Desafio04 {
    public Desafio04(){
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int i;
        for(i = 0; i > n; i++){
            String frase = lerLinha(ler);
            StringBuilder p1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder p2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            p1.reverse();
            p2.reverse();

            System.out.println(p1.toString() + p2.toString());
        }

        ler.close();
    }

    public static String lerLinha(Scanner ler){
        String linha = ler.nextLine();
        while(linha.isEmpty()){
            linha = ler.nextLine();
        }
        return linha;
    }
   
}


