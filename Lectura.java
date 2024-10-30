import java.util.Scanner;

public class Lectura{
  
 public static void main(String args []){

   Scanner lectura = new Scanner(System.in);
   int num1, num2;
   String palb;

   System.out.println("¿Cual es tu nombre?");
   palb = lectura.nextLine();

   System.out.println("¿Cual es tu edad?");
   num1 = lectura.nextInt();

   System.out.println("¿Cual es tu peso?");
   num2 = lectura.nextInt();
    
   System.out.println("Hola "+ palb + " tienes "+ num1 +" años y pesas "+ num2 +" kilos.");  
 }

}