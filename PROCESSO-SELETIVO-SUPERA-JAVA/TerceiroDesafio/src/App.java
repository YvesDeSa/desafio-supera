import java.util.ArrayList;
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

        System.out.print("Insira o valor alvo: ");
        int targetValue = scanner.nextInt();

        List<Integer> values = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            System.out.print("Insira o " + (i + 1) + " valor: ");
            values.add(scanner.nextInt());
        }

        determinePairValues(targetValue, values);
    }

    public static void determinePairValues(int targetValue, List<Integer> values){
        int pairValues = 0;

        for(int i = 0 ; i < values.size() ; i++){
            for(int j = i + 1 ; j < values.size() ; j++){
                if(values.get(i) - values.get(j) == targetValue || values.get(j) - values.get(i) == targetValue){
                    pairValues++;
                }
            }
        }

        System.out.println(pairValues);
    }
}
