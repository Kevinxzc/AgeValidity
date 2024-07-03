import java.util.Scanner;
public class StringEquality {
   public static void main(String [] args){
       Scanner in = new Scanner(System.in);
       String name = "";
       System.out.println("Digite seu nome:");
       name = in.next();
       if (name.equals("Moe")){
           System.out.println("Você é o rei do rock and roll");
           
       }else{
           System.out.println("Você não é o rei do rock and roll");
       }
   }   
 //Ele verifica se o nome é "Moe"e ele imprime "você é o rei do rock and roll" 
}//Caso contrário, imprime "Você não é o rei do rock and roll"

