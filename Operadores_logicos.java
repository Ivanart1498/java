import java.util.Scanner;

public class Operadores_logicos{

  public static void main(String []args){

    Scanner in = new Scanner(System.in);
    
    String nombre = "";
    int antiguedad = 0, Clave = 0;
    
    System.out.print("Ingresar nombre del empleado:");
    nombre = in.nextLine();
    
    System.out.println("Ingresar clave del empleado: 1.Atención al Cliente/2.Departamento de Logística/3.Gerencia");
    Clave = in.nextInt();

    if (Clave == 1){
           System.out.print("Ingresar antiguedad del empleado:");
           antiguedad = in.nextInt();
       if (antiguedad == 1){
	   System.out.println("Hola " + nombre + " con " + antiguedad + " año de antiguedad,  tenes 6 días de vacaciones");    
       } else if (antiguedad > 1 && antiguedad < 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 15 días de vacaciones"); 
       } else if (antiguedad >= 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 20 días de vacaciones"); 
       } else {
	   System.out.println("La opción es invalida."); 
       }
    } else if (Clave == 2){
	   System.out.print("Ingresar antiguedad del empleado:");
           antiguedad = in.nextInt();
	   if (antiguedad == 1){
	   System.out.println("Hola " + nombre + " con " + antiguedad + " año de antiguedad,  tenes 8 días de vacaciones");    
       } else if (antiguedad > 1 && antiguedad < 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 20 días de vacaciones"); 
       } else if (antiguedad >= 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 25 días de vacaciones"); 
       } else {
	   System.out.println("La opción es invalida."); 
       }
    } else if (Clave == 3){
            System.out.print("Ingresar antiguedad del empleado:");
           antiguedad = in.nextInt();
	    if (antiguedad == 1){
	   System.out.println("Hola " + nombre + " con " + antiguedad + " año de antiguedad,  tenes 10 días de vacaciones");    
       } else if (antiguedad > 1 && antiguedad < 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 20 días de vacaciones"); 
       } else if (antiguedad >= 6){
    	   System.out.println("Hola " + nombre + " con " + antiguedad + " años de antiguedad,  tenes 30 días de vacaciones"); 
       } else {
	   System.out.println("La opción es invalida."); 
       }
    } else {
	    System.out.println("La opción es invalida.");
    }

 }
}