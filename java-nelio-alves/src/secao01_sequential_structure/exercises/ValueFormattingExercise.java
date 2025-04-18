package secao01_sequential_structure.exercises;

import java.util.Locale;

public class ValueFormattingExercise {
    public static void main(String[] args) {
        String tecladosf = "Teclado sem fio";
        String mousesf = "Mouse sem fio";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $:%.2f%n", tecladosf, price1);
        System.out.printf("%s, which price is is $:%.2f%n", mousesf, price2);
        System.out.printf("Record %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
