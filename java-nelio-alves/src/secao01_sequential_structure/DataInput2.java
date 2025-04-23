package secao01_sequential_structure;

import java.util.Scanner;

public class DataInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exemplo1(sc);

        sc.close();
    }
    public static void exemplo1(Scanner sc){
        String s1, s2, s3;

        System.out.println("Digite três palavras:");

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
