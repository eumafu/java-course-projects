package secao01_sequential_structure;

public class FormattedVariables {
    public static void main(String[] args) {
        exemplo1();
        exemplo2();
    }
    public static void exemplo1() {
        int x = 123;
        double y = 244;
        System.out.println("impressão de x: " + x + " impressão de y: " +y);
        System.out.printf("Tamanho = %.2f metros%n", y);
    }
    public static void exemplo2() {
        String nome = "Lohany";
        int idade = 18;
        Double renda = 2000.00;
        System.out.printf("%s tem %d anos e ganha R$%.2f reais %n", nome, idade, renda);
    }
}
