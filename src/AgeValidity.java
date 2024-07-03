import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        System.out.println("enter your age:");
        Scanner keyboard = new Scanner(System.in);     
        int age = keyboard.nextInt();
        Boolean drivingUnderAge = false;
        drivingUnderAge = age <= 18 ;
        System.out.println("Driving Under Age?" + drivingUnderAge);
    }  //Expressão booliana para verificar a idade do usuário
}      //Menor ou igual a 18 anos
