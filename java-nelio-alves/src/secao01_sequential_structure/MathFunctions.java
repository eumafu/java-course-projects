package secao01_sequential_structure;

public class MathFunctions {
    public static void main(String[] args) {

        double X = 3.0;
        double Y = 4.0;
        double Z = -5.0;
        double A, B, C;

        A = Math.sqrt(X);
        B = Math.sqrt(Y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + X + " = " + A);
        System.out.println("Raiz quadrada de " + Y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(X, Y);
        B = Math.pow(X, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(X + " Elevado a " + Y + " = " + A);
        System.out.println(X + " Elevado ao quadrado = " +B);
        System.out.println("5 Elevado ao quadrado = " + C);

        A = Math.abs(Y);
        B = Math.abs(Z);
        System.out.println("Valor absoluto de " + Y + " = " + A);
        System.out.println("Valor absoluto de " + Z + " = " + B);
    }
}
