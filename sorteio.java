
import java.util.Scanner;
import java.util.Random;

public class sorteio {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();

        Scanner sc = new Scanner(System.in);


        final int sorteado = aleatorio.nextInt(10);


        int pontuacao = 30;


        do {

            System.out.print("Digite um número:");
            int num = sc.nextInt();

            System.out.println("Número digitado:"+num+ "\nNúmero sorteado:"+sorteado);

            if(num == sorteado){
                System.out.println("\nAcertou com "+pontuacao);
            }else{
                pontuacao = pontuacao - 10;
                System.out.println("\nEstá com "+ pontuacao);
            }

            if(pontuacao == 0){
                System.out.println("\nGame over");
                break;
            }
            
        } while (pontuacao > 0);


        sc.close();
    }
}
