package secao01_sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        //Usando o Scanner como parâmetro para os métodos
        Scanner sc = new Scanner(System.in);
        exemplo1(sc);
        exemplo2(sc);
        exemplo3(sc);
        exemplo4(sc);
        exemplo5(sc);
        exemplo6(sc);

        sc.close();
    }
    /* 1° Puxando o scanner no void
    * 2° usando nextLine (Lê apenas uma palavra)
     */
    public static void exemplo1(Scanner sc){
        System.out.println("Digite seu nome: " );
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);
    }
   //usando nextInt (Lê números inteiros)
    public static void exemplo2(Scanner sc){
        int x;
        System.out.println("Digite sua idade: ");
        x = sc.nextInt();
        System.out.println("Idade: " +x);
    }
    //usando nextDouble (Lê números com vírgula)
    public static void exemplo3(Scanner sc){
        double x;
        System.out.println("Digite sua altura: ");
        x = sc.nextDouble();
        System.out.printf("Altura: %.2f%n", x);
    }
    //usando o Locale para imprimir com .
    public static void exemplo4(Scanner sc){
        Locale.setDefault(Locale.US);
        Double x;
        System.out.println("Digite um número");
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", x);
    }
    //usando Char (Lê caractére)
    public static void exemplo5(Scanner sc){
        char x;
        System.out.println("Digite uma caráctere:");
        x = sc.next().charAt(0);
        System.out.println("Você digitou: "+ x);
    }
    //Lendo várias informações juntas
    public static void exemplo6(Scanner sc){
        String x;
        int y;
        double z;
        System.out.println("Digite uma palavra, um número inteiro e um número com vírgula: ");
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}