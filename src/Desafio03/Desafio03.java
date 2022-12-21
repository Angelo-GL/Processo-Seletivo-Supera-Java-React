package Desafio03;

import java.util.Scanner;

public class Desafio03 {
    public Desafio03(){
        Scanner ler = new Scanner(System.in);

        int i, n, k, l, cont =0, j = 0 ;
        
        System.out.println("*** Valores de entrada (n, k e arr) ***");
        n = ler.nextInt();
        k = ler.nextInt();

        int[] arr = new int[n];

        for(i =0; i < n; i++){
            arr[i] = ler.nextInt();
        }

        for(i = 0; i < n; i++){
            j = arr[i];
            for(l = 0; l < n; l++){
                if(j - arr[l] == k){
                    cont += 1;
                }
            }
        }

        System.out.println("*** Valor de Saída ***");
        System.out.println(cont);
        ler.close();

    }
}
