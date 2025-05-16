package secao01_sequential_structure.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ApplyingSection4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        exec1(sc);
        exec2(sc);
        exec3(sc);
        exec4(sc);
        exec5(sc);
        exec6(sc);
        sc.close();
    }
    public static void exec1(Scanner sc) {

        System.out.println("Digite dois números inteiros para somar: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("A soma de " +x+ " + " +y+ " é igual a: " +(x+y));
    }
    public static void exec2(Scanner sc) {
        double raio, area, pi = 3.14159;
        System.out.println("Digite o valor do Raio: ");
        raio = sc.nextDouble();
        area = pi * raio * raio;
        System.out.printf("A=%.4f%n", area);

    }
    public static void exec3(Scanner sc) {
        int A, B, C, D;
        System.out.println("Digite o valor do A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor do B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor do C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor do D: ");
        D = sc.nextInt();
        float diferenca = (A * B - C * D);
        System.out.println(diferenca);
    }
    public static void exec4(Scanner sc) {
        System.out.println("Digite o número do funcionário: ");
        int nFunc = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        double hrTb = sc.nextDouble();
        System.out.println("Digite o valor por hora: ");
        double valorHr = sc.nextDouble();

        double salario = valorHr * hrTb;

        System.out.println("Numero do funcionário: " + nFunc);
        System.out.printf("O salários pelas horas trabalhadas: U$:%.2f%n", salario);

    }
    public static void exec5(Scanner sc) {
        System.out.println("Digite o código da peça: ");
        int pCod1 = sc.nextInt();

        System.out.println("Quantas unidades você vai comprar?");
        int quantP1 = sc.nextInt();

        System.out.println("Qual o valor da peça?");
        double valorP1 = sc.nextDouble();

        double custo1 = valorP1 * quantP1;

        System.out.println("Digite o código da peça: ");
        int pCod2 = sc.nextInt();

        System.out.println("Quantas unidades você vai comprar?");
        int quantP2 = sc.nextInt();

        System.out.println("Qual o valor da peça?");
        double valorP2 = sc.nextDouble();

        double custo2 = valorP2 * quantP2;

        double totalPag = custo1 + custo2;

        System.out.printf("TOTAL A PAGAR: R$%.2f%n", totalPag);
    }
    public static void exec6(Scanner sc) {
        System.out.println("Digite três valores: ");
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A*C/2.00;
        circulo = 3.14159*C*C;
        trapezio = (A+B)/2.00*C;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
