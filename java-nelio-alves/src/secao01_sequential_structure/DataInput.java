package secao01_sequential_structure;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        //Usando o Scanner como parâmetro para os métodos
        Scanner sc = new Scanner(System.in);
        exemplo1(sc);
        exemplo2(sc);
        exemplo3(sc);

        sc.close();
    }
    public static void exemplo1(Scanner sc){
        System.out.println("Digite seu nome: " );
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);
    }
    public static void exemplo2(Scanner sc){
        int x;
        System.out.println("Digite sua idade: ");
        x = sc.nextInt();
        System.out.println("Idade: " +x);
    }
    public static void exemplo3(Scanner sc){
        double x;
        System.out.println("Digite sua altura: ");
        x = sc.nextDouble();
        System.out.printf("Altura: %.2f%n", x);
    }
}