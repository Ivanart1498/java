public class Operaciones{
  public static void main(String args[]){
    int num1, num2, resultado;
    num1 = 4;
    num2 = 4;

    resultado = num1 + num2;
    System.out.println("El resultado de la suma es:" + resultado);
    resultado = num1 - num2;
    System.out.println("El resultado de la resta es:" + resultado);
    resultado = num1 * num2;
    System.out.println("El resultado de la multiplicación es:" + resultado);
    resultado = num1 / num2;
    System.out.println("El resultado de la división es:" + resultado);
    resultado = num1 + num2 / 2;
    System.out.println("El resultado incorrecto de la operación es:" + resultado);
    resultado = (num1 + num2) / 2;
    System.out.println("El resultado correcto de la operación es:" + resultado);
 
 }
}