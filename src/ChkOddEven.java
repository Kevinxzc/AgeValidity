import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número:");
        num = in.nextInt();
        if ((num % 2)== 0){ 
            
            System.out.println("Esse número é par");  
        }
        if ((num % 2)!= 0){
            
            System.out.println("Esse número é impar");
            
        }//Ele testa se o número é par ou impar
    }    
}     

