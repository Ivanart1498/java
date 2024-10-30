import java.util.Scanner;

public class Switch{
   public static void main(String [] args){
     Scanner Teclado = new Scanner (System.in);
     int num1 = 0, num2 = 0, opcion = 0, res = 0;
     System.out.println("Elije una operación: 1.Suma/2.Resta/3.Multiplicación/4.División");
     opcion = Teclado.nextInt();     

     switch (opcion){
        case 1:{ 
              System.out.print("Ingrese el primer numero: ");
              num1 = Teclado.nextInt();
              System.out.print("Ingrese el segundo numero: ");
              num2 = Teclado.nextInt(); 
              res = num1 + num2;
              System.out.println("El resultado de la Suma es " + res);
              break;
              }
        case 2:{
              System.out.print("Ingrese el primer numero: ");
              num1 = Teclado.nextInt();
              System.out.print("Ingrese el segundo numero: ");
              num2 = Teclado.nextInt();
              res = num1 - num2; 
              System.out.println("El resultado de la Resta es " + res);
              break;
              }
        case 3:{
              System.out.print("Ingrese el primer numero: ");
              num1 = Teclado.nextInt();
              System.out.print("Ingrese el segundo numero: ");
              num2 = Teclado.nextInt(); 
              res = num1 * num2;
              System.out.println("El resultado de la Multiplicación es " + res);
              break;
              }
        case 4:{
             System.out.print("Ingrese el primer numero: ");
             num1 = Teclado.nextInt();
             System.out.print("Ingrese el segundo numero: ");
             num2 = Teclado.nextInt(); 
             res = num1 / num2;
             System.out.println("El resultado de la División es " + res);
             break;
             }
         default: System.out.println("La opción es invalida.");
                  break;
        }

  
    
 }
}