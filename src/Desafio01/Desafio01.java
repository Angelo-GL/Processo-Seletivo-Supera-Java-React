package Desafio01;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio01 {
    public int vet[];
    public int n;
    
    public Desafio01(){
       
       int i, j, temp, valor;
       System.out.println("*** Valores de Entrada ***");

       Scanner ler = new Scanner(System.in);
       this.n = ler.nextInt();
       this.vet = new int [this.n];

        for (i = 0; i < n; i++) {
            valor = ler.nextInt();
            vet[i] = valor;
        }

        int numPar = this.contPar(this.vet, this.n);
        int numImpar = this.contImpar(this.vet, this.n);

        
        int vetAuxPar[] = new int [numPar];
        int vetAuxImpar[] = new int [numImpar];
        int aux = 0;
        for(i = 0; i < this.n; i++){
            if(this.vet[i] % 2 == 0){
                vetAuxPar[aux] = this.vet[i];
                aux+=1;
            }
        }
        aux = 0;
        for(i = 0; i < this.n; i++){
            if(this.vet[i] % 2 != 0){
                vetAuxImpar[aux] = this.vet[i];
                aux+=1;
            }
        }

        Arrays.sort(vetAuxPar);
       
        for(i =0; i < numImpar; i++){
            for(j = 0; j < i; j++){
                if(vetAuxImpar[i] > vetAuxImpar[j]){
                    temp = vetAuxImpar[i];
                    vetAuxImpar[i] = vetAuxImpar[j];
                    vetAuxImpar[j] = temp;
                }
            }
        }
        
        for(i = 0; i < numPar; i++){
            this.vet[i] = vetAuxPar[i];
        }
        
        for(i = 0 ; i < numImpar; i++){
            this.vet[i+numPar] = vetAuxImpar[i];
        }

        System.out.println("*** Valores de Saída ***");
        for(int num: this.vet){
            System.out.println(num);
        }

        ler.close();
    }

    
    private int contPar (int[]vet, int n){
       int cont = 0, i;
       for(i = 0; i < n; i++){
            if(vet[i] % 2 == 0){
                cont+= 1;
            }
       }
        return cont;
    }

    private int contImpar (int[]vet, int n){
        int cont = 0, i;
        for(i = 0; i < n; i++){
             if(vet[i] % 2 != 0){
                 cont+= 1;
             }
        }
         return cont;
     }

}
