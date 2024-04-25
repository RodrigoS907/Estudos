import java.util.Scanner;

public class Leitura{
    public static void main (String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        /*
        int a;
        float b;
        double c;

        System.out.println("Digite um numero inteiro:");
        a = teclado.nextInt();
        System.out.println("Voce digitou o valor " + a);
        System.out.println("Digite um numero float");
        b = teclado.nextFloat();
        System.out.println("voce digitou o valor " + b);
        System.out.println("Digite um valor double");
        c = teclado.nextDouble();
        System.out.println("Voce digitou um valor " + c);
        */


        String nome;
        int    codigo;
        double salario;

        System.out.println("Digite seu codigo:");
        codigo = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();
        System.out.println("Digite seu salario");
        salario = Double.parseDouble(teclado.nextLine());
        System.out.println("Seu codigo e nome e salario: " + codigo + " - " + nome + " - R$" + salario);

        teclado.close();

    }

}