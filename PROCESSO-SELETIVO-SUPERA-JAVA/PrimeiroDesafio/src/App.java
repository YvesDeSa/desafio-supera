import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        enterValues(scanner);
        scanner.close();
    }

    public static void enterValues(Scanner scanner){
        System.out.print("Insira o número de linhas de entrada: ");
        int N = scanner.nextInt();

        List<Integer> values = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            values.add(scanner.nextInt());
        }

        splitValues(values);
    }

    private static void splitValues(List<Integer> values){
        List<Integer> valuesEven = new ArrayList<>();
        List<Integer> valuesOod = new ArrayList<>();

        for(Integer valor : values){
            if(valor % 2 == 0) valuesEven.add(valor);
            else valuesOod.add(valor);
        }

        sortValues(valuesEven, valuesOod);

        printValues(valuesEven);
        printValues(valuesOod);
    }

    public static void sortValues(List<Integer> valuesEven, List<Integer> valuesOod){
        Collections.sort(valuesEven);
        Collections.sort(valuesOod);
        Collections.reverse(valuesOod);
    }

    public static void printValues(List<Integer> values){
        for(Integer valor : values){
           System.out.println(valor);
        }
    }
}
