import java.util.Scanner;

public class Condicional_anidada{
  public static void main(String args[]){
    int num1, num2, res;
    Scanner lectura = new Scanner (System.in);//para pedir datos hay que declarar un Scanner 
    num1 = 8;
    num2 = 4;
   res = 0;

   System.out.println("Elije una operación: 1.Suma/2.Resta/3.Multiplicación/4.División");
   int opcion = lectura.nextInt(); //aca se piden los datos  

   if (opcion == 1){
      res = num1 + num2;
      System.out.println("El resultado de la Suma es: " + res);
   } else if (opcion == 2){
      res = num1 - num2;
      System.out.println("El resultado de la Resta es: " + res);
   } else if (opcion == 3){
      res = num1 * num2;
      System.out.println("El resultado de la Multiplicación es: " + res);
   } else if (opcion == 4){
      res = num1 / num2;
      System.out.println("El resultado de la División es: " + res);
   } else {
      System.out.println("La opción es invalida.");
   }
 }
}