import java.util.Scanner; 

public class question2 {
    public static void main(String args[]){
        //solicita input do usuário
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //verifica se o numero esta na sequencia de Fibonacci
        if (number == 0 || number == 1)
            pertence();

        int n1 = 0, n2 = 1, n3 = n1 + n2;
        while (number >= n3){
            if (number == n3){
                pertence();
                return;
            }
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        naoPertence();
    }

    static void pertence(){
        System.out.println("O número pertence a sequencia de Fibonacci!");
    }

    static void naoPertence(){
        System.out.println("O número não pertence a sequencia de Fibonacci.");
    }
}