import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o value: ");
        
        Double value = scanner.nextDouble();

        splitMoney(value);

        scanner.close();
    }

    public static void splitMoney(Double value){
        int money100 =  (int) Math.floor(value / 100);
        value = value % 100;

        int money50 =  (int) Math.floor(value / 50);
        value = value % 50;

        int money20 =  (int) Math.floor(value / 20);
        value = value % 20;

        int money10 =  (int) Math.floor(value / 10);
        value = value % 10;

        int money5 =  (int) Math.floor(value / 5);
        value = value % 5;

        int money2 =  (int) Math.floor(value / 2);
        value = value % 2;

        int currency1r =  (int) Math.floor(value / 1);
        value = value % 1;

        int currency50 =  (int) Math.floor(value / 0.50);
        value = (Double) (value % 0.50);

        int currency25 =  (int) Math.floor(value / 0.25);
        value = (Double) (value % 0.25);

        int currency10 =  (int) Math.floor(value / 0.10);
        value =  (Double) (value % 0.10);

        int currency5 =  (int) Math.floor(value / 0.05);
        value = (Double) (value % 0.5);

        int currency1 =  (int) Math.floor(value / 0.01);
        value = (Double) (value % 0.01);

        System.out.println("NOTAS: ");

        System.out.println(money100 + " nota(s) de R$ 100.00");
        System.out.println(money50 + " nota(s) de R$ 50.00");
        System.out.println(money20 + " nota(s) de R$ 20.00");
        System.out.println(money10 + " nota(s) de R$ 10.00");
        System.out.println(money5 + " nota(s) de R$ 5.00");
        System.out.println(money2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS: ");
        System.out.println(currency1r + " moeda(s) de R$ 1.00");
        System.out.println(currency50 + " moeda(s) de R$ 0.50");
        System.out.println(currency25 + " moeda(s) de R$ 0.25");
        System.out.println(currency10 + " moeda(s) de R$ 0.10");
        System.out.println(currency5 + " moeda(s) de R$ 0.05");
        System.out.println(currency1 + " moeda(s) de R$ 0.01");
    }
}
