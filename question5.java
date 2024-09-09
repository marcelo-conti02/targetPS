import java.util.Scanner;

public class question5 {
    public static void main(String args[]){
        //solicita input do usuário
        System.out.println("Digite uma string: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        String invertedString = "";
        char[] chars = inputString.toCharArray();

        for(int i = chars.length - 1; i >= 0; i--){
            invertedString += chars[i];
        }

        System.out.println("String invertida: " + invertedString);
    }
}
