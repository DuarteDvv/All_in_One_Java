package Palpite;
import java.util.Scanner;
import java.lang.Math;

public class palpite{
    public static void main(String[] us){
        int tentativas = 0;
        int random = (int)(Math.random()*1001);

        Scanner scan = new Scanner(System.in);

        while(true){

            int a = scan.nextInt();

            tentativas++;

            if(a < random){
                System.out.println("O numero é maior");
            }
            else if(a > random){
                System.out.println("O numero é menor");
            }
            else{
                break;
            }
            
        }
        scan.close();
        System.out.println("Parabens, acertou com " + tentativas + " tentativas");
        
    }
}