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
        scanner.nextLine();

        List<String> line = new ArrayList<>();
        List<String> decoded = new ArrayList<>();
        
        for(int i = 0 ; i < N ; i++){
            System.out.print("Insira o " + (i + 1) + " testo: ");
            line.add(scanner.nextLine());

            int length = line.get(i).length() - 1;
			int half = length / 2 + length % 2;

            Character[] text = new Character[100];
            String textDecoded = "";

			for(int j = half - 1; j >= 0; --j) {
                text[half - j - 1] = line.get(i).charAt(j);
			}

			for(int j = length - 1; j >= half; --j) {
                text[length - j - 1 + half] = line.get(i).charAt(j);
			}

            for(int k = 0 ; k < length ; k++)
                textDecoded += text[k];

            decoded.add(textDecoded);
        }

        printValues(decoded);
        
    }

    public static void printValues(List<String> texts){
        for(String text : texts){
            System.out.println(text);
        }
    }
}
