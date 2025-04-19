package secao01_sequential_structure;

public class DataProcessing {
    public static void main(String[] args) {
        exemplo1();
        exemplo2();
        exemplo3();
        exemplo4();
        exemplo5();
    }
        public static void exemplo1() {
            int x,y;
            x = 5;
            y = 2*x;
            System.out.println(x);
            System.out.println(y);
        }
        public static void exemplo2() {
            int x;
            double y;

            x = 5;
            y = 2*x;
            System.out.println(x);
            System.out.println(y);
    }
        public static void exemplo3() {
            double b,B,h,area;

            b = 6.0;
            B = 8.0;
            h = 5.0;

            area = (b+B) / 2.0*h;
            System.out.println(area);
        }
        public static void exemplo4() {
        int a,b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double) a/b;

            System.out.println(resultado);
        }
        public static void exemplo5() {

        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);
        }
}
