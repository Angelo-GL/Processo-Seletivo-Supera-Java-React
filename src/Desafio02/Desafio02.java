package Desafio02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 

public class Desafio02 {
    private double valorEntrada;

    public Desafio02 (){
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        this.valorEntrada = ler.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");
        
        valor = (int) this.valorEntrada / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", valor);
        this.valorEntrada = this.valorEntrada % 100.0;

        valor = (int) this.valorEntrada / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", valor);
        this.valorEntrada = this.valorEntrada % 50.0;

        valor = (int) this.valorEntrada / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        this.valorEntrada = this.valorEntrada % 20.0;

        valor = (int) this.valorEntrada / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        this.valorEntrada = this.valorEntrada % 10.0;

        valor = (int) this.valorEntrada / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        this.valorEntrada = this.valorEntrada % 5.0;

        valor = (int) this.valorEntrada / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        this.valorEntrada = this.valorEntrada % 2.0;

        System.out.println("MOEDAS:");
        this.valorEntrada *= 100;

        valor = (int) this.valorEntrada / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        this.valorEntrada = this.valorEntrada % 100.0;

        valor = (int) this.valorEntrada / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        this.valorEntrada = this.valorEntrada % 50.0;

        valor = (int) this.valorEntrada / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        this.valorEntrada = this.valorEntrada % 25.0;

        valor = (int) this.valorEntrada / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        this.valorEntrada = this.valorEntrada % 10.0;

        valor = (int) this.valorEntrada / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        this.valorEntrada = this.valorEntrada % 5.0;

        valor = (int) this.valorEntrada / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
        this.valorEntrada = this.valorEntrada % 1.0;

        ler.close();

    }
}
